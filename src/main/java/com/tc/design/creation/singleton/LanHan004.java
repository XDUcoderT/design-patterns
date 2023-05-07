package com.tc.design.creation.singleton;

/**
 * @ClassName LanHan004
 * @Description TODO
 * @Author 陶晨
 * @Date 2023-03-27 21:40
 * @Version 1.0
 **/
public class LanHan004 {
    private static volatile LanHan004 lanHan004;
    private LanHan004() {}

    public static LanHan004 getLanHan004(){
        if(lanHan004 == null){
            synchronized (LanHan004.class){
                if(lanHan004 == null){
                    lanHan004 = new LanHan004();
                }
            }
        }
        return lanHan004;
    }
}
