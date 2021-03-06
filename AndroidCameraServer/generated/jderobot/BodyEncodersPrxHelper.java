// **********************************************************************
//
// Copyright (c) 2003-2013 ZeroC, Inc. All rights reserved.
//
// This copy of Ice is licensed to you under the terms described in the
// ICE_LICENSE file included in this distribution.
//
// **********************************************************************
//
// Ice version 3.5.1
//
// <auto-generated>
//
// Generated from file `bodyencoders.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package jderobot;

/**
 * Interface to the Humanoid Body Encoders.
 **/
public final class BodyEncodersPrxHelper extends Ice.ObjectPrxHelperBase implements BodyEncodersPrx
{
    private static final String __getArmEncodersData_name = "getArmEncodersData";

    public ArmEncodersData getArmEncodersData(BodySide side)
    {
        return getArmEncodersData(side, null, false);
    }

    public ArmEncodersData getArmEncodersData(BodySide side, java.util.Map<String, String> __ctx)
    {
        return getArmEncodersData(side, __ctx, true);
    }

    private ArmEncodersData getArmEncodersData(BodySide side, java.util.Map<String, String> __ctx, boolean __explicitCtx)
    {
        if(__explicitCtx && __ctx == null)
        {
            __ctx = _emptyContext;
        }
        final Ice.Instrumentation.InvocationObserver __observer = IceInternal.ObserverHelper.get(this, "getArmEncodersData", __ctx);
        int __cnt = 0;
        try
        {
            while(true)
            {
                Ice._ObjectDel __delBase = null;
                try
                {
                    __checkTwowayOnly("getArmEncodersData");
                    __delBase = __getDelegate(false);
                    _BodyEncodersDel __del = (_BodyEncodersDel)__delBase;
                    return __del.getArmEncodersData(side, __ctx, __observer);
                }
                catch(IceInternal.LocalExceptionWrapper __ex)
                {
                    __cnt = __handleExceptionWrapperRelaxed(__delBase, __ex, null, __cnt, __observer);
                }
                catch(Ice.LocalException __ex)
                {
                    __cnt = __handleException(__delBase, __ex, null, __cnt, __observer);
                }
            }
        }
        finally
        {
            if(__observer != null)
            {
                __observer.detach();
            }
        }
    }

    public Ice.AsyncResult begin_getArmEncodersData(BodySide side)
    {
        return begin_getArmEncodersData(side, null, false, null);
    }

    public Ice.AsyncResult begin_getArmEncodersData(BodySide side, java.util.Map<String, String> __ctx)
    {
        return begin_getArmEncodersData(side, __ctx, true, null);
    }

    public Ice.AsyncResult begin_getArmEncodersData(BodySide side, Ice.Callback __cb)
    {
        return begin_getArmEncodersData(side, null, false, __cb);
    }

    public Ice.AsyncResult begin_getArmEncodersData(BodySide side, java.util.Map<String, String> __ctx, Ice.Callback __cb)
    {
        return begin_getArmEncodersData(side, __ctx, true, __cb);
    }

    public Ice.AsyncResult begin_getArmEncodersData(BodySide side, Callback_BodyEncoders_getArmEncodersData __cb)
    {
        return begin_getArmEncodersData(side, null, false, __cb);
    }

    public Ice.AsyncResult begin_getArmEncodersData(BodySide side, java.util.Map<String, String> __ctx, Callback_BodyEncoders_getArmEncodersData __cb)
    {
        return begin_getArmEncodersData(side, __ctx, true, __cb);
    }

    private Ice.AsyncResult begin_getArmEncodersData(BodySide side, java.util.Map<String, String> __ctx, boolean __explicitCtx, IceInternal.CallbackBase __cb)
    {
        __checkAsyncTwowayOnly(__getArmEncodersData_name);
        IceInternal.OutgoingAsync __result = new IceInternal.OutgoingAsync(this, __getArmEncodersData_name, __cb);
        try
        {
            __result.__prepare(__getArmEncodersData_name, Ice.OperationMode.Idempotent, __ctx, __explicitCtx);
            IceInternal.BasicStream __os = __result.__startWriteParams(Ice.FormatType.DefaultFormat);
            side.__write(__os);
            __result.__endWriteParams();
            __result.__send(true);
        }
        catch(Ice.LocalException __ex)
        {
            __result.__exceptionAsync(__ex);
        }
        return __result;
    }

    public ArmEncodersData end_getArmEncodersData(Ice.AsyncResult __result)
    {
        Ice.AsyncResult.__check(__result, this, __getArmEncodersData_name);
        boolean __ok = __result.__wait();
        try
        {
            if(!__ok)
            {
                try
                {
                    __result.__throwUserException();
                }
                catch(Ice.UserException __ex)
                {
                    throw new Ice.UnknownUserException(__ex.ice_name(), __ex);
                }
            }
            IceInternal.BasicStream __is = __result.__startReadParams();
            ArmEncodersDataHolder __ret = new ArmEncodersDataHolder();
            __is.readObject(__ret);
            __is.readPendingObjects();
            __result.__endReadParams();
            return __ret.value;
        }
        catch(Ice.LocalException ex)
        {
            Ice.Instrumentation.InvocationObserver __obsv = __result.__getObserver();
            if(__obsv != null)
            {
                __obsv.failed(ex.ice_name());
            }
            throw ex;
        }
    }

    private static final String __getLegEncodersData_name = "getLegEncodersData";

    public LegEncodersData getLegEncodersData(BodySide side)
    {
        return getLegEncodersData(side, null, false);
    }

    public LegEncodersData getLegEncodersData(BodySide side, java.util.Map<String, String> __ctx)
    {
        return getLegEncodersData(side, __ctx, true);
    }

    private LegEncodersData getLegEncodersData(BodySide side, java.util.Map<String, String> __ctx, boolean __explicitCtx)
    {
        if(__explicitCtx && __ctx == null)
        {
            __ctx = _emptyContext;
        }
        final Ice.Instrumentation.InvocationObserver __observer = IceInternal.ObserverHelper.get(this, "getLegEncodersData", __ctx);
        int __cnt = 0;
        try
        {
            while(true)
            {
                Ice._ObjectDel __delBase = null;
                try
                {
                    __checkTwowayOnly("getLegEncodersData");
                    __delBase = __getDelegate(false);
                    _BodyEncodersDel __del = (_BodyEncodersDel)__delBase;
                    return __del.getLegEncodersData(side, __ctx, __observer);
                }
                catch(IceInternal.LocalExceptionWrapper __ex)
                {
                    __cnt = __handleExceptionWrapperRelaxed(__delBase, __ex, null, __cnt, __observer);
                }
                catch(Ice.LocalException __ex)
                {
                    __cnt = __handleException(__delBase, __ex, null, __cnt, __observer);
                }
            }
        }
        finally
        {
            if(__observer != null)
            {
                __observer.detach();
            }
        }
    }

    public Ice.AsyncResult begin_getLegEncodersData(BodySide side)
    {
        return begin_getLegEncodersData(side, null, false, null);
    }

    public Ice.AsyncResult begin_getLegEncodersData(BodySide side, java.util.Map<String, String> __ctx)
    {
        return begin_getLegEncodersData(side, __ctx, true, null);
    }

    public Ice.AsyncResult begin_getLegEncodersData(BodySide side, Ice.Callback __cb)
    {
        return begin_getLegEncodersData(side, null, false, __cb);
    }

    public Ice.AsyncResult begin_getLegEncodersData(BodySide side, java.util.Map<String, String> __ctx, Ice.Callback __cb)
    {
        return begin_getLegEncodersData(side, __ctx, true, __cb);
    }

    public Ice.AsyncResult begin_getLegEncodersData(BodySide side, Callback_BodyEncoders_getLegEncodersData __cb)
    {
        return begin_getLegEncodersData(side, null, false, __cb);
    }

    public Ice.AsyncResult begin_getLegEncodersData(BodySide side, java.util.Map<String, String> __ctx, Callback_BodyEncoders_getLegEncodersData __cb)
    {
        return begin_getLegEncodersData(side, __ctx, true, __cb);
    }

    private Ice.AsyncResult begin_getLegEncodersData(BodySide side, java.util.Map<String, String> __ctx, boolean __explicitCtx, IceInternal.CallbackBase __cb)
    {
        __checkAsyncTwowayOnly(__getLegEncodersData_name);
        IceInternal.OutgoingAsync __result = new IceInternal.OutgoingAsync(this, __getLegEncodersData_name, __cb);
        try
        {
            __result.__prepare(__getLegEncodersData_name, Ice.OperationMode.Idempotent, __ctx, __explicitCtx);
            IceInternal.BasicStream __os = __result.__startWriteParams(Ice.FormatType.DefaultFormat);
            side.__write(__os);
            __result.__endWriteParams();
            __result.__send(true);
        }
        catch(Ice.LocalException __ex)
        {
            __result.__exceptionAsync(__ex);
        }
        return __result;
    }

    public LegEncodersData end_getLegEncodersData(Ice.AsyncResult __result)
    {
        Ice.AsyncResult.__check(__result, this, __getLegEncodersData_name);
        boolean __ok = __result.__wait();
        try
        {
            if(!__ok)
            {
                try
                {
                    __result.__throwUserException();
                }
                catch(Ice.UserException __ex)
                {
                    throw new Ice.UnknownUserException(__ex.ice_name(), __ex);
                }
            }
            IceInternal.BasicStream __is = __result.__startReadParams();
            LegEncodersDataHolder __ret = new LegEncodersDataHolder();
            __is.readObject(__ret);
            __is.readPendingObjects();
            __result.__endReadParams();
            return __ret.value;
        }
        catch(Ice.LocalException ex)
        {
            Ice.Instrumentation.InvocationObserver __obsv = __result.__getObserver();
            if(__obsv != null)
            {
                __obsv.failed(ex.ice_name());
            }
            throw ex;
        }
    }

    private static final String __getOdometryData_name = "getOdometryData";

    public OdometryData getOdometryData(CameraBody camera)
    {
        return getOdometryData(camera, null, false);
    }

    public OdometryData getOdometryData(CameraBody camera, java.util.Map<String, String> __ctx)
    {
        return getOdometryData(camera, __ctx, true);
    }

    private OdometryData getOdometryData(CameraBody camera, java.util.Map<String, String> __ctx, boolean __explicitCtx)
    {
        if(__explicitCtx && __ctx == null)
        {
            __ctx = _emptyContext;
        }
        final Ice.Instrumentation.InvocationObserver __observer = IceInternal.ObserverHelper.get(this, "getOdometryData", __ctx);
        int __cnt = 0;
        try
        {
            while(true)
            {
                Ice._ObjectDel __delBase = null;
                try
                {
                    __checkTwowayOnly("getOdometryData");
                    __delBase = __getDelegate(false);
                    _BodyEncodersDel __del = (_BodyEncodersDel)__delBase;
                    return __del.getOdometryData(camera, __ctx, __observer);
                }
                catch(IceInternal.LocalExceptionWrapper __ex)
                {
                    __cnt = __handleExceptionWrapperRelaxed(__delBase, __ex, null, __cnt, __observer);
                }
                catch(Ice.LocalException __ex)
                {
                    __cnt = __handleException(__delBase, __ex, null, __cnt, __observer);
                }
            }
        }
        finally
        {
            if(__observer != null)
            {
                __observer.detach();
            }
        }
    }

    public Ice.AsyncResult begin_getOdometryData(CameraBody camera)
    {
        return begin_getOdometryData(camera, null, false, null);
    }

    public Ice.AsyncResult begin_getOdometryData(CameraBody camera, java.util.Map<String, String> __ctx)
    {
        return begin_getOdometryData(camera, __ctx, true, null);
    }

    public Ice.AsyncResult begin_getOdometryData(CameraBody camera, Ice.Callback __cb)
    {
        return begin_getOdometryData(camera, null, false, __cb);
    }

    public Ice.AsyncResult begin_getOdometryData(CameraBody camera, java.util.Map<String, String> __ctx, Ice.Callback __cb)
    {
        return begin_getOdometryData(camera, __ctx, true, __cb);
    }

    public Ice.AsyncResult begin_getOdometryData(CameraBody camera, Callback_BodyEncoders_getOdometryData __cb)
    {
        return begin_getOdometryData(camera, null, false, __cb);
    }

    public Ice.AsyncResult begin_getOdometryData(CameraBody camera, java.util.Map<String, String> __ctx, Callback_BodyEncoders_getOdometryData __cb)
    {
        return begin_getOdometryData(camera, __ctx, true, __cb);
    }

    private Ice.AsyncResult begin_getOdometryData(CameraBody camera, java.util.Map<String, String> __ctx, boolean __explicitCtx, IceInternal.CallbackBase __cb)
    {
        __checkAsyncTwowayOnly(__getOdometryData_name);
        IceInternal.OutgoingAsync __result = new IceInternal.OutgoingAsync(this, __getOdometryData_name, __cb);
        try
        {
            __result.__prepare(__getOdometryData_name, Ice.OperationMode.Idempotent, __ctx, __explicitCtx);
            IceInternal.BasicStream __os = __result.__startWriteParams(Ice.FormatType.DefaultFormat);
            camera.__write(__os);
            __result.__endWriteParams();
            __result.__send(true);
        }
        catch(Ice.LocalException __ex)
        {
            __result.__exceptionAsync(__ex);
        }
        return __result;
    }

    public OdometryData end_getOdometryData(Ice.AsyncResult __result)
    {
        Ice.AsyncResult.__check(__result, this, __getOdometryData_name);
        boolean __ok = __result.__wait();
        try
        {
            if(!__ok)
            {
                try
                {
                    __result.__throwUserException();
                }
                catch(Ice.UserException __ex)
                {
                    throw new Ice.UnknownUserException(__ex.ice_name(), __ex);
                }
            }
            IceInternal.BasicStream __is = __result.__startReadParams();
            OdometryDataHolder __ret = new OdometryDataHolder();
            __is.readObject(__ret);
            __is.readPendingObjects();
            __result.__endReadParams();
            return __ret.value;
        }
        catch(Ice.LocalException ex)
        {
            Ice.Instrumentation.InvocationObserver __obsv = __result.__getObserver();
            if(__obsv != null)
            {
                __obsv.failed(ex.ice_name());
            }
            throw ex;
        }
    }

    public static BodyEncodersPrx checkedCast(Ice.ObjectPrx __obj)
    {
        BodyEncodersPrx __d = null;
        if(__obj != null)
        {
            if(__obj instanceof BodyEncodersPrx)
            {
                __d = (BodyEncodersPrx)__obj;
            }
            else
            {
                if(__obj.ice_isA(ice_staticId()))
                {
                    BodyEncodersPrxHelper __h = new BodyEncodersPrxHelper();
                    __h.__copyFrom(__obj);
                    __d = __h;
                }
            }
        }
        return __d;
    }

    public static BodyEncodersPrx checkedCast(Ice.ObjectPrx __obj, java.util.Map<String, String> __ctx)
    {
        BodyEncodersPrx __d = null;
        if(__obj != null)
        {
            if(__obj instanceof BodyEncodersPrx)
            {
                __d = (BodyEncodersPrx)__obj;
            }
            else
            {
                if(__obj.ice_isA(ice_staticId(), __ctx))
                {
                    BodyEncodersPrxHelper __h = new BodyEncodersPrxHelper();
                    __h.__copyFrom(__obj);
                    __d = __h;
                }
            }
        }
        return __d;
    }

    public static BodyEncodersPrx checkedCast(Ice.ObjectPrx __obj, String __facet)
    {
        BodyEncodersPrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            try
            {
                if(__bb.ice_isA(ice_staticId()))
                {
                    BodyEncodersPrxHelper __h = new BodyEncodersPrxHelper();
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

    public static BodyEncodersPrx checkedCast(Ice.ObjectPrx __obj, String __facet, java.util.Map<String, String> __ctx)
    {
        BodyEncodersPrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            try
            {
                if(__bb.ice_isA(ice_staticId(), __ctx))
                {
                    BodyEncodersPrxHelper __h = new BodyEncodersPrxHelper();
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

    public static BodyEncodersPrx uncheckedCast(Ice.ObjectPrx __obj)
    {
        BodyEncodersPrx __d = null;
        if(__obj != null)
        {
            if(__obj instanceof BodyEncodersPrx)
            {
                __d = (BodyEncodersPrx)__obj;
            }
            else
            {
                BodyEncodersPrxHelper __h = new BodyEncodersPrxHelper();
                __h.__copyFrom(__obj);
                __d = __h;
            }
        }
        return __d;
    }

    public static BodyEncodersPrx uncheckedCast(Ice.ObjectPrx __obj, String __facet)
    {
        BodyEncodersPrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            BodyEncodersPrxHelper __h = new BodyEncodersPrxHelper();
            __h.__copyFrom(__bb);
            __d = __h;
        }
        return __d;
    }

    public static final String[] __ids =
    {
        "::Ice::Object",
        "::jderobot::BodyEncoders"
    };

    public static String ice_staticId()
    {
        return __ids[1];
    }

    protected Ice._ObjectDelM __createDelegateM()
    {
        return new _BodyEncodersDelM();
    }

    protected Ice._ObjectDelD __createDelegateD()
    {
        return new _BodyEncodersDelD();
    }

    public static void __write(IceInternal.BasicStream __os, BodyEncodersPrx v)
    {
        __os.writeProxy(v);
    }

    public static BodyEncodersPrx __read(IceInternal.BasicStream __is)
    {
        Ice.ObjectPrx proxy = __is.readProxy();
        if(proxy != null)
        {
            BodyEncodersPrxHelper result = new BodyEncodersPrxHelper();
            result.__copyFrom(proxy);
            return result;
        }
        return null;
    }

    public static final long serialVersionUID = 0L;
}
