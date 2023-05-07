package com.tc.design.creation.factory.abstarct_factory;

/**
 * @ClassName N95Mask
 * @Description TODO
 * @Author 陶晨
 * @Date 2023-05-07 13:07
 * @Version 1.0
 **/
public class N95Mask extends AbstractMask{

    public N95Mask() {
        price = 2;
    }

    @Override
    public void protectMe() {
        System.out.println("N95口罩...超级防护");
    }
}
