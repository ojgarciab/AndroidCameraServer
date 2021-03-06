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
// Generated from file `jointmotor.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package RoboCompJointMotor;

public abstract class Callback_JointMotor_getAllMotorState extends Ice.TwowayCallback
{
    public abstract void response(java.util.Map<java.lang.String, MotorState> mstateMap);
    public abstract void exception(Ice.UserException __ex);

    public final void __completed(Ice.AsyncResult __result)
    {
        JointMotorPrx __proxy = (JointMotorPrx)__result.getProxy();
        MotorStateMapHolder mstateMap = new MotorStateMapHolder();
        try
        {
            __proxy.end_getAllMotorState(mstateMap, __result);
        }
        catch(Ice.UserException __ex)
        {
            exception(__ex);
            return;
        }
        catch(Ice.LocalException __ex)
        {
            exception(__ex);
            return;
        }
        response(mstateMap.value);
    }
}
