package com.tc.design.creation.factory.abstarct_factory;

/**
 * @ClassName WulinVanCarFactory
 * @Description TODO
 * @Author 陶晨
 * @Date 2023-05-07 12:44
 * @Version 1.0
 **/
public class WuLinVanCarFactory extends WuLinFactory {
    @Override
    public AbstractCar newCar() {
        return new VanCar();
    }

    @Override
    AbstractMask newMask() {
        return null;
    }
}
