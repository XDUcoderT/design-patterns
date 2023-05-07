package com.tc.design.creation.singleton;

public class EHan001 {
    private final static EHan001 eHan001 = new EHan001();
    private EHan001(){

    }
    public static EHan001 getSingleton(){
        return eHan001;  //访问静态变量 本来就会导致类初始化
    }
}
