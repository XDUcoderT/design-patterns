package com.tc.design.creation.factory.abstarct_factory;

/**
 * @ClassName CommonMask
 * @Description TODO
 * @Author 陶晨
 * @Date 2023-05-07 13:10
 * @Version 1.0
 **/
public class CommonMask extends AbstractMask{
    public CommonMask(){
        price = 1;
    };
    @Override
    public void protectMe() {
        System.out.println("普通口罩....简单保护");
    }
}
