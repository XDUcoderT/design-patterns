package com.tc.design.creation.factory.abstarct_factory;

import com.tc.design.creation.factory.factorymethod.AbstractCarFactory;

/**
 * @ClassName WulinVanCarFactory
 * @Description TODO
 * @Author 陶晨
 * @Date 2023-05-07 12:44
 * @Version 1.0
 **/
//具体工厂
public class WuLinRacingCarFactory extends WuLinFactory {
    @Override
    AbstractCar newCar() {
        return new RacingCar();
    }

    @Override
    AbstractMask newMask() {
        return null;
    }
}
