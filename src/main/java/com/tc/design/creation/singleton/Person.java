package com.tc.design.creation.singleton;

public class Person {
    private static Person instance;
    //构造器私有，外部不能实例化
    private Person() {
        System.out.println("创建了xidianjuju");
    }

    //1. public static synchronized Person xidianjuju()锁太大

    public static synchronized Person xidianjuju(){
        //懒汉式 如果没有再去创建
        if(instance == null){
            instance = new Person();
        }
        return instance;
    }
}
