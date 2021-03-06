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
// Generated from file `varcolor.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package jderobot;

/**
 * Interface to the image provider.
 **/
public final class VarColorPrxHelper extends Ice.ObjectPrxHelperBase implements VarColorPrx
{
    private static final String __getData_name = "getData";

    /**
     * Returns the latest data.
     **/
    public ImageData getData()
        throws DataNotExistException,
               HardwareFailedException
    {
        return getData(null, false);
    }

    /**
     * Returns the latest data.
     * @param __ctx The Context map to send with the invocation.
     **/
    public ImageData getData(java.util.Map<String, String> __ctx)
        throws DataNotExistException,
               HardwareFailedException
    {
        return getData(__ctx, true);
    }

    private ImageData getData(java.util.Map<String, String> __ctx, boolean __explicitCtx)
        throws DataNotExistException,
               HardwareFailedException
    {
        if(__explicitCtx && __ctx == null)
        {
            __ctx = _emptyContext;
        }
        final Ice.Instrumentation.InvocationObserver __observer = IceInternal.ObserverHelper.get(this, "getData", __ctx);
        int __cnt = 0;
        try
        {
            while(true)
            {
                Ice._ObjectDel __delBase = null;
                try
                {
                    __checkTwowayOnly("getData");
                    __delBase = __getDelegate(false);
                    _VarColorDel __del = (_VarColorDel)__delBase;
                    return __del.getData(__ctx, __observer);
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

    /**
     * Returns the latest data.
     * @param __cb The callback object for the operation.
     **/
    public Ice.AsyncResult begin_getData()
    {
        return begin_getData(null, false, null);
    }

    /**
     * Returns the latest data.
     * @param __cb The callback object for the operation.
     * @param __ctx The Context map to send with the invocation.
     **/
    public Ice.AsyncResult begin_getData(java.util.Map<String, String> __ctx)
    {
        return begin_getData(__ctx, true, null);
    }

    /**
     * Returns the latest data.
     * @param __cb The callback object for the operation.
     **/
    public Ice.AsyncResult begin_getData(Ice.Callback __cb)
    {
        return begin_getData(null, false, __cb);
    }

    /**
     * Returns the latest data.
     * @param __cb The callback object for the operation.
     * @param __ctx The Context map to send with the invocation.
     **/
    public Ice.AsyncResult begin_getData(java.util.Map<String, String> __ctx, Ice.Callback __cb)
    {
        return begin_getData(__ctx, true, __cb);
    }

    /**
     * Returns the latest data.
     * @param __cb The callback object for the operation.
     **/
    public Ice.AsyncResult begin_getData(Callback_VarColor_getData __cb)
    {
        return begin_getData(null, false, __cb);
    }

    /**
     * Returns the latest data.
     * @param __cb The callback object for the operation.
     * @param __ctx The Context map to send with the invocation.
     **/
    public Ice.AsyncResult begin_getData(java.util.Map<String, String> __ctx, Callback_VarColor_getData __cb)
    {
        return begin_getData(__ctx, true, __cb);
    }

    private Ice.AsyncResult begin_getData(java.util.Map<String, String> __ctx, boolean __explicitCtx, IceInternal.CallbackBase __cb)
    {
        __checkAsyncTwowayOnly(__getData_name);
        IceInternal.OutgoingAsync __result = new IceInternal.OutgoingAsync(this, __getData_name, __cb);
        try
        {
            __result.__prepare(__getData_name, Ice.OperationMode.Idempotent, __ctx, __explicitCtx);
            __result.__writeEmptyParams();
            __result.__send(true);
        }
        catch(Ice.LocalException __ex)
        {
            __result.__exceptionAsync(__ex);
        }
        return __result;
    }

    /**
     * ice_response indicates that
     * the operation completed successfully.
     **/
    public ImageData end_getData(Ice.AsyncResult __result)
        throws DataNotExistException,
               HardwareFailedException
    {
        Ice.AsyncResult.__check(__result, this, __getData_name);
        boolean __ok = __result.__wait();
        try
        {
            if(!__ok)
            {
                try
                {
                    __result.__throwUserException();
                }
                catch(DataNotExistException __ex)
                {
                    throw __ex;
                }
                catch(HardwareFailedException __ex)
                {
                    throw __ex;
                }
                catch(Ice.UserException __ex)
                {
                    throw new Ice.UnknownUserException(__ex.ice_name(), __ex);
                }
            }
            IceInternal.BasicStream __is = __result.__startReadParams();
            ImageDataHolder __ret = new ImageDataHolder();
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

    private static final String __getDescription_name = "getDescription";

    /**
     * Returns the image source description.
     **/
    public ImageDescription getDescription()
    {
        return getDescription(null, false);
    }

    /**
     * Returns the image source description.
     * @param __ctx The Context map to send with the invocation.
     **/
    public ImageDescription getDescription(java.util.Map<String, String> __ctx)
    {
        return getDescription(__ctx, true);
    }

    private ImageDescription getDescription(java.util.Map<String, String> __ctx, boolean __explicitCtx)
    {
        if(__explicitCtx && __ctx == null)
        {
            __ctx = _emptyContext;
        }
        final Ice.Instrumentation.InvocationObserver __observer = IceInternal.ObserverHelper.get(this, "getDescription", __ctx);
        int __cnt = 0;
        try
        {
            while(true)
            {
                Ice._ObjectDel __delBase = null;
                try
                {
                    __checkTwowayOnly("getDescription");
                    __delBase = __getDelegate(false);
                    _VarColorDel __del = (_VarColorDel)__delBase;
                    return __del.getDescription(__ctx, __observer);
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

    /**
     * Returns the image source description.
     * @param __cb The callback object for the operation.
     **/
    public Ice.AsyncResult begin_getDescription()
    {
        return begin_getDescription(null, false, null);
    }

    /**
     * Returns the image source description.
     * @param __cb The callback object for the operation.
     * @param __ctx The Context map to send with the invocation.
     **/
    public Ice.AsyncResult begin_getDescription(java.util.Map<String, String> __ctx)
    {
        return begin_getDescription(__ctx, true, null);
    }

    /**
     * Returns the image source description.
     * @param __cb The callback object for the operation.
     **/
    public Ice.AsyncResult begin_getDescription(Ice.Callback __cb)
    {
        return begin_getDescription(null, false, __cb);
    }

    /**
     * Returns the image source description.
     * @param __cb The callback object for the operation.
     * @param __ctx The Context map to send with the invocation.
     **/
    public Ice.AsyncResult begin_getDescription(java.util.Map<String, String> __ctx, Ice.Callback __cb)
    {
        return begin_getDescription(__ctx, true, __cb);
    }

    /**
     * Returns the image source description.
     * @param __cb The callback object for the operation.
     **/
    public Ice.AsyncResult begin_getDescription(Callback_VarColor_getDescription __cb)
    {
        return begin_getDescription(null, false, __cb);
    }

    /**
     * Returns the image source description.
     * @param __cb The callback object for the operation.
     * @param __ctx The Context map to send with the invocation.
     **/
    public Ice.AsyncResult begin_getDescription(java.util.Map<String, String> __ctx, Callback_VarColor_getDescription __cb)
    {
        return begin_getDescription(__ctx, true, __cb);
    }

    private Ice.AsyncResult begin_getDescription(java.util.Map<String, String> __ctx, boolean __explicitCtx, IceInternal.CallbackBase __cb)
    {
        __checkAsyncTwowayOnly(__getDescription_name);
        IceInternal.OutgoingAsync __result = new IceInternal.OutgoingAsync(this, __getDescription_name, __cb);
        try
        {
            __result.__prepare(__getDescription_name, Ice.OperationMode.Idempotent, __ctx, __explicitCtx);
            __result.__writeEmptyParams();
            __result.__send(true);
        }
        catch(Ice.LocalException __ex)
        {
            __result.__exceptionAsync(__ex);
        }
        return __result;
    }

    /**
     * ice_response indicates that
     * the operation completed successfully.
     **/
    public ImageDescription end_getDescription(Ice.AsyncResult __result)
    {
        Ice.AsyncResult.__check(__result, this, __getDescription_name);
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
            ImageDescriptionHolder __ret = new ImageDescriptionHolder();
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

    public static VarColorPrx checkedCast(Ice.ObjectPrx __obj)
    {
        VarColorPrx __d = null;
        if(__obj != null)
        {
            if(__obj instanceof VarColorPrx)
            {
                __d = (VarColorPrx)__obj;
            }
            else
            {
                if(__obj.ice_isA(ice_staticId()))
                {
                    VarColorPrxHelper __h = new VarColorPrxHelper();
                    __h.__copyFrom(__obj);
                    __d = __h;
                }
            }
        }
        return __d;
    }

    public static VarColorPrx checkedCast(Ice.ObjectPrx __obj, java.util.Map<String, String> __ctx)
    {
        VarColorPrx __d = null;
        if(__obj != null)
        {
            if(__obj instanceof VarColorPrx)
            {
                __d = (VarColorPrx)__obj;
            }
            else
            {
                if(__obj.ice_isA(ice_staticId(), __ctx))
                {
                    VarColorPrxHelper __h = new VarColorPrxHelper();
                    __h.__copyFrom(__obj);
                    __d = __h;
                }
            }
        }
        return __d;
    }

    public static VarColorPrx checkedCast(Ice.ObjectPrx __obj, String __facet)
    {
        VarColorPrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            try
            {
                if(__bb.ice_isA(ice_staticId()))
                {
                    VarColorPrxHelper __h = new VarColorPrxHelper();
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

    public static VarColorPrx checkedCast(Ice.ObjectPrx __obj, String __facet, java.util.Map<String, String> __ctx)
    {
        VarColorPrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            try
            {
                if(__bb.ice_isA(ice_staticId(), __ctx))
                {
                    VarColorPrxHelper __h = new VarColorPrxHelper();
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

    public static VarColorPrx uncheckedCast(Ice.ObjectPrx __obj)
    {
        VarColorPrx __d = null;
        if(__obj != null)
        {
            if(__obj instanceof VarColorPrx)
            {
                __d = (VarColorPrx)__obj;
            }
            else
            {
                VarColorPrxHelper __h = new VarColorPrxHelper();
                __h.__copyFrom(__obj);
                __d = __h;
            }
        }
        return __d;
    }

    public static VarColorPrx uncheckedCast(Ice.ObjectPrx __obj, String __facet)
    {
        VarColorPrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            VarColorPrxHelper __h = new VarColorPrxHelper();
            __h.__copyFrom(__bb);
            __d = __h;
        }
        return __d;
    }

    public static final String[] __ids =
    {
        "::Ice::Object",
        "::jderobot::VarColor"
    };

    public static String ice_staticId()
    {
        return __ids[1];
    }

    protected Ice._ObjectDelM __createDelegateM()
    {
        return new _VarColorDelM();
    }

    protected Ice._ObjectDelD __createDelegateD()
    {
        return new _VarColorDelD();
    }

    public static void __write(IceInternal.BasicStream __os, VarColorPrx v)
    {
        __os.writeProxy(v);
    }

    public static VarColorPrx __read(IceInternal.BasicStream __is)
    {
        Ice.ObjectPrx proxy = __is.readProxy();
        if(proxy != null)
        {
            VarColorPrxHelper result = new VarColorPrxHelper();
            result.__copyFrom(proxy);
            return result;
        }
        return null;
    }

    public static final long serialVersionUID = 0L;
}
