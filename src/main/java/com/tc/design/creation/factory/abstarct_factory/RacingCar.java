package com.tc.design.creation.factory.abstarct_factory;


/**
 * @ClassName VanCar
 * @Description TODO
 * @Author 陶晨
 * @Date 2023-05-06 19:28
 * @Version 1.0
 **/
/*
* @description: 具体产品
* @author: 陶晨
* @date: 2023-05-06 19:29
* @param:
* @return:
**/
public class RacingCar extends AbstractCar {
    public RacingCar(){
        this.engine = "v8发动机";
    }
    @Override
    public void run() {
        System.out.println(engine + "--->" + "嗒嗒嗒");
    }
}
