package com.tc.design.creation.singleton;

/**
 * @ClassName LanHan003
 * @Description TODO
 * @Author 陶晨
 * @Date 2023-03-27 21:23
 * @Version 1.0
 **/
public class LanHan003 {
    private static LanHan003 lanHan003;
    private LanHan003() {}

    public static LanHan003 getLanHan003(){
        if(lanHan003 == null){
            synchronized (LanHan003.class){
                lanHan003 = new LanHan003();
            }
        }
        return lanHan003;
    }
}
