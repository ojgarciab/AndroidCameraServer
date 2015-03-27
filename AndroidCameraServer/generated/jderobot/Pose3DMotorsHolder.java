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
// Generated from file `pose3dmotors.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package jderobot;

public final class Pose3DMotorsHolder extends Ice.ObjectHolderBase<Pose3DMotors>
{
    public
    Pose3DMotorsHolder()
    {
    }

    public
    Pose3DMotorsHolder(Pose3DMotors value)
    {
        this.value = value;
    }

    public void
    patch(Ice.Object v)
    {
        if(v == null || v instanceof Pose3DMotors)
        {
            value = (Pose3DMotors)v;
        }
        else
        {
            IceInternal.Ex.throwUOE(type(), v);
        }
    }

    public String
    type()
    {
        return _Pose3DMotorsDisp.ice_staticId();
    }
}
