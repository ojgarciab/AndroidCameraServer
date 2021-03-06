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
 * Arm 
 **/
public class ArmEncodersData extends Ice.ObjectImpl
{
    public ArmEncodersData()
    {
    }

    public ArmEncodersData(BodyMotor shoulder, BodyMotor elbow, int clock)
    {
        this.shoulder = shoulder;
        this.elbow = elbow;
        this.clock = clock;
    }

    private static class __F implements Ice.ObjectFactory
    {
        public Ice.Object create(String type)
        {
            assert(type.equals(ice_staticId()));
            return new ArmEncodersData();
        }

        public void destroy()
        {
        }
    }
    private static Ice.ObjectFactory _factory = new __F();

    public static Ice.ObjectFactory
    ice_factory()
    {
        return _factory;
    }

    public static final String[] __ids =
    {
        "::Ice::Object",
        "::jderobot::ArmEncodersData"
    };

    public boolean ice_isA(String s)
    {
        return java.util.Arrays.binarySearch(__ids, s) >= 0;
    }

    public boolean ice_isA(String s, Ice.Current __current)
    {
        return java.util.Arrays.binarySearch(__ids, s) >= 0;
    }

    public String[] ice_ids()
    {
        return __ids;
    }

    public String[] ice_ids(Ice.Current __current)
    {
        return __ids;
    }

    public String ice_id()
    {
        return __ids[1];
    }

    public String ice_id(Ice.Current __current)
    {
        return __ids[1];
    }

    public static String ice_staticId()
    {
        return __ids[1];
    }

    protected void __writeImpl(IceInternal.BasicStream __os)
    {
        __os.startWriteSlice(ice_staticId(), -1, true);
        shoulder.__write(__os);
        elbow.__write(__os);
        __os.writeInt(clock);
        __os.endWriteSlice();
    }

    protected void __readImpl(IceInternal.BasicStream __is)
    {
        __is.startReadSlice();
        shoulder = new BodyMotor();
        shoulder.__read(__is);
        elbow = new BodyMotor();
        elbow.__read(__is);
        clock = __is.readInt();
        __is.endReadSlice();
    }

    public BodyMotor shoulder;

    public BodyMotor elbow;

    public int clock;

    public static final long serialVersionUID = 5052827717112783061L;
}
