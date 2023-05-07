package com.tc.design.creation.factory.factorymethod;

/**
 * @ClassName WulinVanCarFactory
 * @Description TODO
 * @Author 陶晨
 * @Date 2023-05-07 12:44
 * @Version 1.0
 **/
public class WuLinRacingCarFactory extends AbstractCarFactory{
    @Override
    public AbstractCar newCar() {
        return new RacingCar();
    }
}
