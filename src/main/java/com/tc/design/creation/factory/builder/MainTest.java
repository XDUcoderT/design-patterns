package com.tc.design.creation.factory.builder;

/**
 * @ClassName MainTest
 * @Description TODO
 * @Author 陶晨
 * @Date 2023-05-07 13:58
 * @Version 1.0
 **/
public class MainTest {


    public static void main(String[] args) {
        AbstractBuilder builder = new XiaoMiBuilder();
        //建造者
//        builder.customMem("16G");
//        builder.customDisk("1T");
//        builder.customCam("2亿");
//        builder.customCpu("骁龙888");
//
//        System.out.println("===== 链式建造者====");
        //链式建造者
//        builder.customMem("16G")
//                .customDisk("1T")
//                .customCam("2亿")
//                .customCpu("骁龙888");
//        Phone phone = builder.getProduct();
//        System.out.println(phone);
        Phone.PhoneBuilder phoneBuilder = Phone.builder();
        Phone phone = phoneBuilder.cpu("1").mem("2").cam("3").disk("4").build();
        System.out.println(phone);
    }
}
