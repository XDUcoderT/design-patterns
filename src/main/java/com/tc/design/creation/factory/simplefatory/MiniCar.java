package com.tc.design.creation.factory.simplefatory;

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
public class MiniCar extends AbstractCar{
    public MiniCar(){
        this.engine = "四缸水平对置发动机";
    }
    @Override
    public void run() {
        System.out.println(engine + "--->" + "嗒嗒嗒");
    }
}
