package com.tc.design.creation.factory.factorymethod;


/**
 * @ClassName MainTest
 * @Description TODO
 * @Author 陶晨
 * @Date 2023-05-06 19:25
 * @Version 1.0
 **/
public class MainTest {
    public static void main(String[] args) {
        AbstractCarFactory carFactory = new WuLinRacingCarFactory();
        AbstractCar abstractCar = carFactory.newCar();
        abstractCar.run();

        carFactory = new WuLinVanCarFactory();
        AbstractCar abstractCar1 = carFactory.newCar();
        abstractCar1.run();
    }
}


