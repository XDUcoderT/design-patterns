package com.tc.design.creation.singleton;

/**
 * @ClassName LanHan001
 * @Description TODO
 * @Author 陶晨
 * @Date 2023-03-27 20:49
 * @Version 1.0
 **/
public class LanHan001 {
    private static LanHan001 lanHan001;
    private LanHan001() {}

    public static LanHan001 getLanHan001(){
        if(lanHan001 == null){
            lanHan001 = new LanHan001();
        }
        return lanHan001;
    }
}
