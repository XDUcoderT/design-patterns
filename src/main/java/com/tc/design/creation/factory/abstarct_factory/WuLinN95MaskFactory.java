package com.tc.design.creation.factory.abstarct_factory;

/**
 * @ClassName WuLinN95MaskFactory
 * @Description TODO
 * @Author 陶晨
 * @Date 2023-05-07 13:19
 * @Version 1.0
 **/
public class WuLinN95MaskFactory extends WuLinFactory{
    @Override
    AbstractCar newCar() {
        return null;
    }

    @Override
    AbstractMask newMask() {
        return new N95Mask();
    }
}
