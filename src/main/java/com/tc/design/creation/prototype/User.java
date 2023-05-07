package com.tc.design.creation.prototype;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.Particle;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.*;

/**
 * @ClassName User
 * @Description TODO
 * @Author 陶晨
 * @Date 2023-05-04 16:59
 * @Version 1.0
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
//当前对象是可克隆的
public class User implements Cloneable,Serializable{
    private String name;
    private Integer age;
    private User friend;

    public User(String name) {
        this.name = name;
    }

//    @Override
//    protected Object clone() throws CloneNotSupportedException {
//        User clonedUser = (User)super.clone();
//        if(clonedUser.getFriend()!=null){
//            clonedUser.setFriend((User) clonedUser.getFriend().clone());
//        }
//        return clonedUser;
//    }


    @Override
    protected Object clone() throws CloneNotSupportedException {
        return deepCloneObject(this);
    }

    /**
     * 对象的深度克隆，此处的对象涉及Collection接口和Map接口下对象的深度克隆
     * 利用序列化和反序列化的方式进行深度克隆对象
     *
     * @param <T> 待克隆对象的数据类型
     * @param object 待克隆的对象
     * @return 已经深度克隆过的对象
     */
    public static <T extends Serializable> T deepCloneObject(Object object) {
        T deepClone = null;
        ByteArrayOutputStream baos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bais = null;
        ObjectInputStream ois = null;
        try {
            baos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(baos);
            oos.writeObject(object);
            bais = new ByteArrayInputStream(baos
                    .toByteArray());
            ois = new ObjectInputStream(bais);
            deepClone = (T)ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if(baos != null) {
                    baos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                if(oos != null) {
                    oos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

            try{
                if(bais != null) {
                    bais.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

            try{
                if(ois != null) {
                    ois.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return deepClone;
    }
}


