package com.tc.design.creation.singleton;

/**
 * @ClassName LanHan001
 * @Description TODO
 * @Author 陶晨
 * @Date 2023-03-27 20:49
 * @Version 1.0
 **/
public class LanHan002 {
    private static LanHan002 lanHan002;
    private LanHan002() {}

    public static synchronized LanHan002 getLanHan002(){
        if(lanHan002 == null){
            lanHan002 = new LanHan002();
        }
        return lanHan002;
    }
}
