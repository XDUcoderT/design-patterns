package com.tc.design.creation.factory.abstarct_factory;

/**
 * @ClassName MainTest
 * @Description TODO
 * @Author 陶晨
 * @Date 2023-05-07 13:20
 * @Version 1.0
 **/
public class MainTest {
    public static void main(String[] args) {
        WuLinFactory wuLinFactory = new WuLinN95MaskFactory();
        System.out.println(wuLinFactory.newCar());
        AbstractMask abstractMask = wuLinFactory.newMask();
        abstractMask.protectMe();
        wuLinFactory = new WuLinCommonMaskFactory();
        wuLinFactory.newMask().protectMe();
    }
}
