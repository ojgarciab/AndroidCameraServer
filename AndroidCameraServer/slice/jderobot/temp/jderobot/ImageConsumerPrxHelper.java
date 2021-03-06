// **********************************************************************
//
// Copyright (c) 2003-2011 ZeroC, Inc. All rights reserved.
//
// This copy of Ice is licensed to you under the terms described in the
// ICE_LICENSE file included in this distribution.
//
// **********************************************************************
//
// Ice version 3.4.2
//
// <auto-generated>
//
// Generated from file `ImageConsumerPrxHelper.java'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package jderobot;

public final class ImageConsumerPrxHelper extends Ice.ObjectPrxHelperBase implements ImageConsumerPrx
{
    public void
    report(ImageData obj)
    {
        report(obj, null, false);
    }

    public void
    report(ImageData obj, java.util.Map<String, String> __ctx)
    {
        report(obj, __ctx, true);
    }

    private void
    report(ImageData obj, java.util.Map<String, String> __ctx, boolean __explicitCtx)
    {
        if(__explicitCtx && __ctx == null)
        {
            __ctx = _emptyContext;
        }
        int __cnt = 0;
        while(true)
        {
            Ice._ObjectDel __delBase = null;
            try
            {
                __delBase = __getDelegate(false);
                _ImageConsumerDel __del = (_ImageConsumerDel)__delBase;
                __del.report(obj, __ctx);
                return;
            }
            catch(IceInternal.LocalExceptionWrapper __ex)
            {
                __handleExceptionWrapper(__delBase, __ex);
            }
            catch(Ice.LocalException __ex)
            {
                __cnt = __handleException(__delBase, __ex, null, __cnt);
            }
        }
    }

    private static final String __report_name = "report";

    public Ice.AsyncResult begin_report(ImageData obj)
    {
        return begin_report(obj, null, false, null);
    }

    public Ice.AsyncResult begin_report(ImageData obj, java.util.Map<String, String> __ctx)
    {
        return begin_report(obj, __ctx, true, null);
    }

    public Ice.AsyncResult begin_report(ImageData obj, Ice.Callback __cb)
    {
        return begin_report(obj, null, false, __cb);
    }

    public Ice.AsyncResult begin_report(ImageData obj, java.util.Map<String, String> __ctx, Ice.Callback __cb)
    {
        return begin_report(obj, __ctx, true, __cb);
    }

    public Ice.AsyncResult begin_report(ImageData obj, Callback_ImageConsumer_report __cb)
    {
        return begin_report(obj, null, false, __cb);
    }

    public Ice.AsyncResult begin_report(ImageData obj, java.util.Map<String, String> __ctx, Callback_ImageConsumer_report __cb)
    {
        return begin_report(obj, __ctx, true, __cb);
    }

    private Ice.AsyncResult begin_report(ImageData obj, java.util.Map<String, String> __ctx, boolean __explicitCtx, IceInternal.CallbackBase __cb)
    {
        IceInternal.OutgoingAsync __result = new IceInternal.OutgoingAsync(this, __report_name, __cb);
        try
        {
            __result.__prepare(__report_name, Ice.OperationMode.Normal, __ctx, __explicitCtx);
            IceInternal.BasicStream __os = __result.__os();
            __os.writeObject(obj);
            __os.writePendingObjects();
            __os.endWriteEncaps();
            __result.__send(true);
        }
        catch(Ice.LocalException __ex)
        {
            __result.__exceptionAsync(__ex);
        }
        return __result;
    }

    public void end_report(Ice.AsyncResult __result)
    {
        __end(__result, __report_name);
    }

    public static ImageConsumerPrx
    checkedCast(Ice.ObjectPrx __obj)
    {
        ImageConsumerPrx __d = null;
        if(__obj != null)
        {
            try
            {
                __d = (ImageConsumerPrx)__obj;
            }
            catch(ClassCastException ex)
            {
                if(__obj.ice_isA(ice_staticId()))
                {
                    ImageConsumerPrxHelper __h = new ImageConsumerPrxHelper();
                    __h.__copyFrom(__obj);
                    __d = __h;
                }
            }
        }
        return __d;
    }

    public static ImageConsumerPrx
    checkedCast(Ice.ObjectPrx __obj, java.util.Map<String, String> __ctx)
    {
        ImageConsumerPrx __d = null;
        if(__obj != null)
        {
            try
            {
                __d = (ImageConsumerPrx)__obj;
            }
            catch(ClassCastException ex)
            {
                if(__obj.ice_isA(ice_staticId(), __ctx))
                {
                    ImageConsumerPrxHelper __h = new ImageConsumerPrxHelper();
                    __h.__copyFrom(__obj);
                    __d = __h;
                }
            }
        }
        return __d;
    }

    public static ImageConsumerPrx
    checkedCast(Ice.ObjectPrx __obj, String __facet)
    {
        ImageConsumerPrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            try
            {
                if(__bb.ice_isA(ice_staticId()))
                {
                    ImageConsumerPrxHelper __h = new ImageConsumerPrxHelper();
                    __h.__copyFrom(__bb);
                    __d = __h;
                }
            }
            catch(Ice.FacetNotExistException ex)
            {
            }
        }
        return __d;
    }

    public static ImageConsumerPrx
    checkedCast(Ice.ObjectPrx __obj, String __facet, java.util.Map<String, String> __ctx)
    {
        ImageConsumerPrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            try
            {
                if(__bb.ice_isA(ice_staticId(), __ctx))
                {
                    ImageConsumerPrxHelper __h = new ImageConsumerPrxHelper();
                    __h.__copyFrom(__bb);
                    __d = __h;
                }
            }
            catch(Ice.FacetNotExistException ex)
            {
            }
        }
        return __d;
    }

    public static ImageConsumerPrx
    uncheckedCast(Ice.ObjectPrx __obj)
    {
        ImageConsumerPrx __d = null;
        if(__obj != null)
        {
            try
            {
                __d = (ImageConsumerPrx)__obj;
            }
            catch(ClassCastException ex)
            {
                ImageConsumerPrxHelper __h = new ImageConsumerPrxHelper();
                __h.__copyFrom(__obj);
                __d = __h;
            }
        }
        return __d;
    }

    public static ImageConsumerPrx
    uncheckedCast(Ice.ObjectPrx __obj, String __facet)
    {
        ImageConsumerPrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            ImageConsumerPrxHelper __h = new ImageConsumerPrxHelper();
            __h.__copyFrom(__bb);
            __d = __h;
        }
        return __d;
    }

    public static final String[] __ids =
    {
        "::Ice::Object",
        "::jderobot::ImageConsumer"
    };

    public static String
    ice_staticId()
    {
        return __ids[1];
    }

    protected Ice._ObjectDelM
    __createDelegateM()
    {
        return new _ImageConsumerDelM();
    }

    protected Ice._ObjectDelD
    __createDelegateD()
    {
        return new _ImageConsumerDelD();
    }

    public static void
    __write(IceInternal.BasicStream __os, ImageConsumerPrx v)
    {
        __os.writeProxy(v);
    }

    public static ImageConsumerPrx
    __read(IceInternal.BasicStream __is)
    {
        Ice.ObjectPrx proxy = __is.readProxy();
        if(proxy != null)
        {
            ImageConsumerPrxHelper result = new ImageConsumerPrxHelper();
            result.__copyFrom(proxy);
            return result;
        }
        return null;
    }
}
