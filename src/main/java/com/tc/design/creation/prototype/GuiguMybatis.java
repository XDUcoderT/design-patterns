package com.tc.design.creation.prototype;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;


/**
 * @ClassName GuiguMybatis
 * @Description 场景 ：操作数据库，从数据库里面查出很多记录(70%改变很少)
*               问题 ：每次查数据库，查到以后把所有数据都封装成一个对象，返回
 *                    如果有10000个Thread 查一条记录 系统里就会有10000个User 浪费内存
 *              解决：缓存，查过的缓存 如果再查相同的记录 拿到原来的原型对象
 * @Author 陶晨
 * @Date 2023-05-04 17:01
 * @Version 1.0
 **/
public class GuiguMybatis {
    private static Map<String,User> userCache = new HashMap<>();

    /*
    * @description: 从数据库里查数据
    * @author: 陶晨
    * @date: 2023-05-04 17:01
    * @param: []
    * @return: com.tc.design.creation.prototype.User
    **/
    public User getUser(String username){
        //缓存中没有
        if(!userCache.containsKey(username)){
            //从数据库中查
            User userFromDB = getUserFromDB(username);
            //存到缓存中
            userCache.put(username,userFromDB);
            try {
                return (User) userFromDB.clone();
            } catch (CloneNotSupportedException e) {
                throw new RuntimeException(e);
            }
        }else{
            //从缓存中拿
            System.out.print("从缓存中拿 ");
            //原型已经拿到,但是不能直接给，如果直接给会引起脏缓存问题
            //从这个对象快速得到一个克隆体 ====> 原型模式
            User user = userCache.get(username);
            try {
                user = (User)user.clone();
            } catch (CloneNotSupportedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("user：" + user);
            return user;
        }
    }

    private static User getUserFromDB(String username) {
        System.out.println("从数据库中查到" + username);
        User user = new User(username,18,new User("小红"));
        return user;
    }

}
