package com.tc.design.creation.factory.simplefatory;

/**
 * @ClassName MainTest
 * @Description TODO
 * @Author 陶晨
 * @Date 2023-05-06 19:25
 * @Version 1.0
 **/
public class MainTest {
    public static void main(String[] args) {
        WuLinSimpleFactory factory = new WuLinSimpleFactory();
        AbstractCar van = factory.newCar("van");
        AbstractCar mini = factory.newCar("mini");
        AbstractCar zz = factory.newCar("zz");
        van.run();
        mini.run();
    }
}


