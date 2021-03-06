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
// Generated from file `camera.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package jderobot;

/**
 * Static description of a camera
 **/
public final class CameraDescriptionPrxHelper extends Ice.ObjectPrxHelperBase implements CameraDescriptionPrx
{
    public static CameraDescriptionPrx checkedCast(Ice.ObjectPrx __obj)
    {
        CameraDescriptionPrx __d = null;
        if(__obj != null)
        {
            if(__obj instanceof CameraDescriptionPrx)
            {
                __d = (CameraDescriptionPrx)__obj;
            }
            else
            {
                if(__obj.ice_isA(ice_staticId()))
                {
                    CameraDescriptionPrxHelper __h = new CameraDescriptionPrxHelper();
                    __h.__copyFrom(__obj);
                    __d = __h;
                }
            }
        }
        return __d;
    }

    public static CameraDescriptionPrx checkedCast(Ice.ObjectPrx __obj, java.util.Map<String, String> __ctx)
    {
        CameraDescriptionPrx __d = null;
        if(__obj != null)
        {
            if(__obj instanceof CameraDescriptionPrx)
            {
                __d = (CameraDescriptionPrx)__obj;
            }
            else
            {
                if(__obj.ice_isA(ice_staticId(), __ctx))
                {
                    CameraDescriptionPrxHelper __h = new CameraDescriptionPrxHelper();
                    __h.__copyFrom(__obj);
                    __d = __h;
                }
            }
        }
        return __d;
    }

    public static CameraDescriptionPrx checkedCast(Ice.ObjectPrx __obj, String __facet)
    {
        CameraDescriptionPrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            try
            {
                if(__bb.ice_isA(ice_staticId()))
                {
                    CameraDescriptionPrxHelper __h = new CameraDescriptionPrxHelper();
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

    public static CameraDescriptionPrx checkedCast(Ice.ObjectPrx __obj, String __facet, java.util.Map<String, String> __ctx)
    {
        CameraDescriptionPrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            try
            {
                if(__bb.ice_isA(ice_staticId(), __ctx))
                {
                    CameraDescriptionPrxHelper __h = new CameraDescriptionPrxHelper();
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

    public static CameraDescriptionPrx uncheckedCast(Ice.ObjectPrx __obj)
    {
        CameraDescriptionPrx __d = null;
        if(__obj != null)
        {
            if(__obj instanceof CameraDescriptionPrx)
            {
                __d = (CameraDescriptionPrx)__obj;
            }
            else
            {
                CameraDescriptionPrxHelper __h = new CameraDescriptionPrxHelper();
                __h.__copyFrom(__obj);
                __d = __h;
            }
        }
        return __d;
    }

    public static CameraDescriptionPrx uncheckedCast(Ice.ObjectPrx __obj, String __facet)
    {
        CameraDescriptionPrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            CameraDescriptionPrxHelper __h = new CameraDescriptionPrxHelper();
            __h.__copyFrom(__bb);
            __d = __h;
        }
        return __d;
    }

    public static final String[] __ids =
    {
        "::Ice::Object",
        "::jderobot::CameraDescription"
    };

    public static String ice_staticId()
    {
        return __ids[1];
    }

    protected Ice._ObjectDelM __createDelegateM()
    {
        return new _CameraDescriptionDelM();
    }

    protected Ice._ObjectDelD __createDelegateD()
    {
        return new _CameraDescriptionDelD();
    }

    public static void __write(IceInternal.BasicStream __os, CameraDescriptionPrx v)
    {
        __os.writeProxy(v);
    }

    public static CameraDescriptionPrx __read(IceInternal.BasicStream __is)
    {
        Ice.ObjectPrx proxy = __is.readProxy();
        if(proxy != null)
        {
            CameraDescriptionPrxHelper result = new CameraDescriptionPrxHelper();
            result.__copyFrom(proxy);
            return result;
        }
        return null;
    }

    public static final long serialVersionUID = 0L;
}
