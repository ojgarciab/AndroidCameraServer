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
// Generated from file `naomotions.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package jderobot;

/**
 * Interface to the Nao motions
 **/
public final class NaoMotionsPrxHelper extends Ice.ObjectPrxHelperBase implements NaoMotionsPrx
{
    private static final String __setMotion_name = "setMotion";

    public int setMotion(MotionType motion)
    {
        return setMotion(motion, null, false);
    }

    public int setMotion(MotionType motion, java.util.Map<String, String> __ctx)
    {
        return setMotion(motion, __ctx, true);
    }

    private int setMotion(MotionType motion, java.util.Map<String, String> __ctx, boolean __explicitCtx)
    {
        if(__explicitCtx && __ctx == null)
        {
            __ctx = _emptyContext;
        }
        final Ice.Instrumentation.InvocationObserver __observer = IceInternal.ObserverHelper.get(this, "setMotion", __ctx);
        int __cnt = 0;
        try
        {
            while(true)
            {
                Ice._ObjectDel __delBase = null;
                try
                {
                    __checkTwowayOnly("setMotion");
                    __delBase = __getDelegate(false);
                    _NaoMotionsDel __del = (_NaoMotionsDel)__delBase;
                    return __del.setMotion(motion, __ctx, __observer);
                }
                catch(IceInternal.LocalExceptionWrapper __ex)
                {
                    __handleExceptionWrapper(__delBase, __ex, __observer);
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

    public Ice.AsyncResult begin_setMotion(MotionType motion)
    {
        return begin_setMotion(motion, null, false, null);
    }

    public Ice.AsyncResult begin_setMotion(MotionType motion, java.util.Map<String, String> __ctx)
    {
        return begin_setMotion(motion, __ctx, true, null);
    }

    public Ice.AsyncResult begin_setMotion(MotionType motion, Ice.Callback __cb)
    {
        return begin_setMotion(motion, null, false, __cb);
    }

    public Ice.AsyncResult begin_setMotion(MotionType motion, java.util.Map<String, String> __ctx, Ice.Callback __cb)
    {
        return begin_setMotion(motion, __ctx, true, __cb);
    }

    public Ice.AsyncResult begin_setMotion(MotionType motion, Callback_NaoMotions_setMotion __cb)
    {
        return begin_setMotion(motion, null, false, __cb);
    }

    public Ice.AsyncResult begin_setMotion(MotionType motion, java.util.Map<String, String> __ctx, Callback_NaoMotions_setMotion __cb)
    {
        return begin_setMotion(motion, __ctx, true, __cb);
    }

    private Ice.AsyncResult begin_setMotion(MotionType motion, java.util.Map<String, String> __ctx, boolean __explicitCtx, IceInternal.CallbackBase __cb)
    {
        __checkAsyncTwowayOnly(__setMotion_name);
        IceInternal.OutgoingAsync __result = new IceInternal.OutgoingAsync(this, __setMotion_name, __cb);
        try
        {
            __result.__prepare(__setMotion_name, Ice.OperationMode.Normal, __ctx, __explicitCtx);
            IceInternal.BasicStream __os = __result.__startWriteParams(Ice.FormatType.DefaultFormat);
            motion.__write(__os);
            __result.__endWriteParams();
            __result.__send(true);
        }
        catch(Ice.LocalException __ex)
        {
            __result.__exceptionAsync(__ex);
        }
        return __result;
    }

    public int end_setMotion(Ice.AsyncResult __result)
    {
        Ice.AsyncResult.__check(__result, this, __setMotion_name);
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
            int __ret;
            __ret = __is.readInt();
            __result.__endReadParams();
            return __ret;
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

    public static NaoMotionsPrx checkedCast(Ice.ObjectPrx __obj)
    {
        NaoMotionsPrx __d = null;
        if(__obj != null)
        {
            if(__obj instanceof NaoMotionsPrx)
            {
                __d = (NaoMotionsPrx)__obj;
            }
            else
            {
                if(__obj.ice_isA(ice_staticId()))
                {
                    NaoMotionsPrxHelper __h = new NaoMotionsPrxHelper();
                    __h.__copyFrom(__obj);
                    __d = __h;
                }
            }
        }
        return __d;
    }

    public static NaoMotionsPrx checkedCast(Ice.ObjectPrx __obj, java.util.Map<String, String> __ctx)
    {
        NaoMotionsPrx __d = null;
        if(__obj != null)
        {
            if(__obj instanceof NaoMotionsPrx)
            {
                __d = (NaoMotionsPrx)__obj;
            }
            else
            {
                if(__obj.ice_isA(ice_staticId(), __ctx))
                {
                    NaoMotionsPrxHelper __h = new NaoMotionsPrxHelper();
                    __h.__copyFrom(__obj);
                    __d = __h;
                }
            }
        }
        return __d;
    }

    public static NaoMotionsPrx checkedCast(Ice.ObjectPrx __obj, String __facet)
    {
        NaoMotionsPrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            try
            {
                if(__bb.ice_isA(ice_staticId()))
                {
                    NaoMotionsPrxHelper __h = new NaoMotionsPrxHelper();
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

    public static NaoMotionsPrx checkedCast(Ice.ObjectPrx __obj, String __facet, java.util.Map<String, String> __ctx)
    {
        NaoMotionsPrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            try
            {
                if(__bb.ice_isA(ice_staticId(), __ctx))
                {
                    NaoMotionsPrxHelper __h = new NaoMotionsPrxHelper();
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

    public static NaoMotionsPrx uncheckedCast(Ice.ObjectPrx __obj)
    {
        NaoMotionsPrx __d = null;
        if(__obj != null)
        {
            if(__obj instanceof NaoMotionsPrx)
            {
                __d = (NaoMotionsPrx)__obj;
            }
            else
            {
                NaoMotionsPrxHelper __h = new NaoMotionsPrxHelper();
                __h.__copyFrom(__obj);
                __d = __h;
            }
        }
        return __d;
    }

    public static NaoMotionsPrx uncheckedCast(Ice.ObjectPrx __obj, String __facet)
    {
        NaoMotionsPrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            NaoMotionsPrxHelper __h = new NaoMotionsPrxHelper();
            __h.__copyFrom(__bb);
            __d = __h;
        }
        return __d;
    }

    public static final String[] __ids =
    {
        "::Ice::Object",
        "::jderobot::NaoMotions"
    };

    public static String ice_staticId()
    {
        return __ids[1];
    }

    protected Ice._ObjectDelM __createDelegateM()
    {
        return new _NaoMotionsDelM();
    }

    protected Ice._ObjectDelD __createDelegateD()
    {
        return new _NaoMotionsDelD();
    }

    public static void __write(IceInternal.BasicStream __os, NaoMotionsPrx v)
    {
        __os.writeProxy(v);
    }

    public static NaoMotionsPrx __read(IceInternal.BasicStream __is)
    {
        Ice.ObjectPrx proxy = __is.readProxy();
        if(proxy != null)
        {
            NaoMotionsPrxHelper result = new NaoMotionsPrxHelper();
            result.__copyFrom(proxy);
            return result;
        }
        return null;
    }

    public static final long serialVersionUID = 0L;
}
