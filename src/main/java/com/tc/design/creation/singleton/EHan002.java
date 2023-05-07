package com.tc.design.creation.singleton;

/**
 * @ClassName EHan002
 * @Description TODO
 * @Author 陶晨
 * @Date 2023-03-27 20:40
 * @Version 1.0
 **/
public class EHan002 {
    private static EHan002 eHan002;

    private EHan002(){

    }

    static{
        //在静态代码块中创建单例对象
        eHan002 = new EHan002();
    }

    public static EHan002 getSingleton(){
        return eHan002;  //访问静态变量 本来就会导致类初始化
    }
}
