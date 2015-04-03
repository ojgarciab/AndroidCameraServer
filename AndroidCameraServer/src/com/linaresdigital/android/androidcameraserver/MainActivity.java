/**
 * Actividad de prueba que enmarca y controla tanto la vista preliminar de la
 * cámara como la interfaz ICE publicada.
 * 
 * @author Óscar Javier García Baudet
 * @version 1.0, 2013-01-08
 */

package com.linaresdigital.android.androidcameraserver;

import android.graphics.ImageFormat;
import android.hardware.Camera;
import android.hardware.Camera.AutoFocusCallback;
import android.hardware.Camera.PreviewCallback;
import android.hardware.Camera.Size;
import android.os.Bundle;
import android.os.Handler;
import android.os.Build.VERSION;
import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.util.Log;
import android.view.Menu;
import android.widget.FrameLayout;

public class MainActivity extends Activity {

	private static final String TAG = MainActivity.class.getClass().getName();
	/**
	 * Instance of ImageProvider implementation to be published
	 */
	private CameraI cameraA;
	/**
	 * Instance of camera to be used in activity
	 */
	static private Camera mCamera;
	/**
	 * Instance of implementation of the camera preview that we'll use
	 */
	private CameraPreview mPreview;
	private Handler autoFocusHandler;
	private boolean previsualizando = false;
	private FrameLayout preview;

	/**
	 * 
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		/* We require landscape orientation */
		setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
		/* Provide continuous autofocus if camera does not support it */
		autoFocusHandler = new Handler();
		/* Get an instance of the default camera */
		mCamera = getCameraInstance();
		/* We create an instance of CameraPreview to manage the camera */
		mPreview = new CameraPreview(this, mCamera, previewCb, autoFocusCB);
		/* Find the frame that will contain the camera preview */
		preview = (FrameLayout) findViewById(R.id.frameLayout);
		/* Add view to frame */
		preview.addView(mPreview);

		/* Initialize ICE, copied from an example */
		/**************************************************************************/
		if (VERSION.SDK_INT == 8) // android.os.Build.VERSION_CODES.FROYO (8)
		{
			//
			// Workaround for a bug in Android 2.2 (Froyo).
			//
			// See http://code.google.com/p/android/issues/detail?id=9431
			//
			java.lang.System.setProperty("java.net.preferIPv4Stack", "true");
			java.lang.System.setProperty("java.net.preferIPv6Addresses",
					"false");
		}

		/* Continuing the example copied */
		// SSL initialization can take some time. To avoid blocking the
		// calling thread, we perform the initialization in a separate thread.
		new Thread(new Runnable() {
			public void run() {
				initializeCommunicator();
			}
		}).start();
		/**************************************************************************/
	}

	/**
	 * Safe way to get the instance of camera
	 */
	public static Camera getCameraInstance() {
		Camera camara = null;
		try {
			/* Open the camera */
			camara = Camera.open();
		} catch (Exception e) {
			Log.e(TAG, "No se pudo inicializar la cámara");
		}
		return camara;
	}

	private void releaseCamera() {
		if (mCamera != null) {
			/* Disable callbacks */
			mCamera.setPreviewCallback(null);
			mCamera.release();
			mCamera = null;
			/* Save the state */
			previsualizando = false;
		}
	}

	private Runnable doAutoFocus = new Runnable() {

		public void run() {
			if (previsualizando)
				mCamera.autoFocus(autoFocusCB);
		}
	};

	PreviewCallback previewCb = new PreviewCallback() {
		public void onPreviewFrame(byte[] data, Camera camera) {
			previsualizando = true;
			try {
				if (CameraI.idDatos == null)
					return;
				Camera.Parameters parameters = camera.getParameters();
				Size size = parameters.getPreviewSize();
				switch (parameters.getPreviewFormat()) {
				case ImageFormat.NV21:
					CameraI.idDatos.format = "NV21";
					break;
				case ImageFormat.YUY2:
					CameraI.idDatos.format = "YUY2";
				default:
					CameraI.idDatos.format = "YCRCB";
				}
				CameraI.idDatos.width = size.width;
				CameraI.idDatos.height = size.height;
				CameraI.idImagen.pixelData = data.clone();
				long milisegundos = System.currentTimeMillis();
				CameraI.idImagen.timeStamp.seconds = (long) (milisegundos / 1000);
				CameraI.idImagen.timeStamp.useconds = (milisegundos % 1000) * 1000;
				new Thread(new Runnable() {
					public void run() {
						CameraI.Job actual;
						while ((actual = CameraI._jobs.poll()) != null) {
							actual.execute();
						}
					}
				}).start();
				/*
				 * CameraI.Job actual; while ((actual = CameraI._jobs.poll()) !=
				 * null) { actual.execute(); }
				 */
			} catch (Exception ex) {
				Log.e(TAG, "Prueba");
			}
		}
	};

	AutoFocusCallback autoFocusCB = new AutoFocusCallback() {
		public void onAutoFocus(boolean success, Camera camera) {
			autoFocusHandler.postDelayed(doAutoFocus, 3500);
		}
	};

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

	public void onStop() {
		super.onStop();
	}

	public void onPause() {
		super.onPause();
		releaseCamera();
		preview.removeAllViews();
		mPreview = null;
	}

	@Override
	protected void onResume() {
		super.onResume();
		/* Create a fresh instance of CameraPreview to manage the camera */
		mPreview = new CameraPreview(this, mCamera, previewCb, autoFocusCB);
		/* Find the frame that will contain the camera preview */
		preview = (FrameLayout) findViewById(R.id.frameLayout);
		/* Add new view to frame */
		preview.addView(mPreview);
	}

	/* Implementation of ICE */
	interface CommunicatorCallback {
		void onWait();

		void onCreate(Ice.Communicator communicator);

		void onError(Ice.LocalException ex);
	}

	private Ice.Communicator _communicator;
	private CommunicatorCallback _cb;

	private void initializeCommunicator() {
		try {
			Ice.Communicator communicator;
			Ice.InitializationData initData = new Ice.InitializationData();
			initData.properties = Ice.Util.createProperties();
			initData.properties.setProperty("Ice.Trace.Network", "3");

			//
			// Only configure IceSSL if we are using Froyo or later.
			//
			/*
			 * if(VERSION.SDK_INT >= 8) // android.os.Build.VERSION_CODES.FROYO
			 * (8) { initData.properties.setProperty("IceSSL.Trace.Security",
			 * "3"); initData.properties.setProperty("IceSSL.KeystoreType",
			 * "BKS"); initData.properties.setProperty("IceSSL.TruststoreType",
			 * "BKS"); initData.properties.setProperty("IceSSL.Password",
			 * "password"); initData.properties.setProperty("Ice.InitPlugins",
			 * "0"); initData.properties.setProperty("Ice.Plugin.IceSSL",
			 * "IceSSL.PluginFactory"); }
			 */

			communicator = Ice.Util.initialize(initData);
			Ice.ObjectAdapter adapter = communicator
					.createObjectAdapterWithEndpoints("CameraAdapter",
							"default -h 0.0.0.0 -p 9999");
			cameraA = new CameraI();
			adapter.add((Ice.Object) cameraA,
					Ice.Util.stringToIdentity("cameraA"));
			adapter.activate();
			Log.e(TAG, cameraA.ice_id());

			/*
			 * if(VERSION.SDK_INT >= 8) // android.os.Build.VERSION_CODES.FROYO
			 * (8) { IceSSL.Plugin plugin =
			 * (IceSSL.Plugin)communicator.getPluginManager
			 * ().getPlugin("IceSSL"); // // Be sure to pass the same input
			 * stream to the SSL plug-in for // both the keystore and the
			 * truststore. This makes startup a // little faster since the
			 * plugin will not initialize // two keystores. //
			 * java.io.InputStream certs =
			 * getResources().openRawResource(R.raw.certs);
			 * plugin.setKeystoreStream(certs);
			 * plugin.setTruststoreStream(certs);
			 * communicator.getPluginManager().initializePlugins(); }
			 */

			synchronized (this) {
				_communicator = communicator;
				if (_cb != null) {
					_cb.onCreate(_communicator);
				}
			}
		} catch (Ice.LocalException ex) {
			synchronized (this) {
				if (_cb != null) {
					_cb.onError(ex);
				}
			}
		}
	}
}
