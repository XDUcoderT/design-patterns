package com.tc.design.creation.singleton;

public class LanHan001 {
    private final static LanHan001 lanHan001 = new LanHan001();
    private LanHan001(){

    }
    public static LanHan001 getSingleton(){
        return lanHan001;
    }
}
