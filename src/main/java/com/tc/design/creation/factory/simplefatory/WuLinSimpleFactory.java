package com.tc.design.creation.factory.simplefatory;

/**
 * @ClassName WuLinSimpleFactory
 * 简单工厂
 * 1. 产品数量极少
 * 2.
 * @Description TODO
 * @Author 陶晨
 * @Date 2023-05-06 19:26
 * @Version 1.0
 **/
public class WuLinSimpleFactory {
    public AbstractCar newCar(String type){
        //核心方法 一切从简:通过if else判断
        //问题：如果有更多的产品，就会增加if else判断 这就违背了开闭原则：对扩展开放对修改关闭，应该直接扩展出一个类来造
        if("van".equals(type)){
            return new VanCar();
        }else if("mini".equals(type)){
            return new MiniCar();
        }
        return null;
    }
}
