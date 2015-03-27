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

public class OutOfRangeException extends Ice.UserException
{
    public OutOfRangeException()
    {
    }

    public OutOfRangeException(Throwable __cause)
    {
        super(__cause);
    }

    public OutOfRangeException(String what)
    {
        this.what = what;
    }

    public OutOfRangeException(String what, Throwable __cause)
    {
        super(__cause);
        this.what = what;
    }

    public String
    ice_name()
    {
        return "RoboCompJointMotor::OutOfRangeException";
    }

    public String what;

    protected void
    __writeImpl(IceInternal.BasicStream __os)
    {
        __os.startWriteSlice("::RoboCompJointMotor::OutOfRangeException", -1, true);
        __os.writeString(what);
        __os.endWriteSlice();
    }

    protected void
    __readImpl(IceInternal.BasicStream __is)
    {
        __is.startReadSlice();
        what = __is.readString();
        __is.endReadSlice();
    }

    public static final long serialVersionUID = 6497390661270156597L;
}
