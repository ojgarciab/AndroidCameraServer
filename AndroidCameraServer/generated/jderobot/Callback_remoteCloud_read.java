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
// Generated from file `remoteCloud.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package jderobot;

public abstract class Callback_remoteCloud_read extends Ice.TwowayCallback
{
    public abstract void response(String __ret);

    public final void __completed(Ice.AsyncResult __result)
    {
        remoteCloudPrx __proxy = (remoteCloudPrx)__result.getProxy();
        String __ret = null;
        try
        {
            __ret = __proxy.end_read(__result);
        }
        catch(Ice.LocalException __ex)
        {
            exception(__ex);
            return;
        }
        response(__ret);
    }
}