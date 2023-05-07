package com.tc.design.creation.prototype;

/**
 * @ClassName MainTets
 * @Description TODO
 * @Author 陶晨
 * @Date 2023-05-04 16:53
 * @Version 1.0
 * 适用于创建重复的对象，同时又能保证性能
 * 1. Guigu
 **/
public class MainTest {
    public static void main(String[] args) {
        GuiguMybatis guiguMybatis = new GuiguMybatis();
        User zhangsan = guiguMybatis.getUser("zhangsan");
        System.out.println(zhangsan);
        zhangsan.setName("lisi");
        User user = guiguMybatis.getUser("zhangsan");
        user.getFriend().setName("小李");
        guiguMybatis.getUser("zhangsan");
        guiguMybatis.getUser("zhangsan");
        guiguMybatis.getUser("zhangsan");
        guiguMybatis.getUser("zhangsan");
    }
}
