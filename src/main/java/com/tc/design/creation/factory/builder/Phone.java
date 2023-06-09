package com.tc.design.creation.factory.builder;

import lombok.Builder;
import lombok.Data;

/**
 * @ClassName Phone
 * @Description TODO
 * @Author 陶晨
 * @Date 2023-05-07 13:50
 * @Version 1.0
 **/
@Builder
public class Phone {
    protected String cpu;
    protected String mem;
    protected String disk;
    protected String cam;

    public String getCpu() {
        return cpu;
    }

    public String getMem() {
        return mem;
    }

    public String getDisk() {
        return disk;
    }

    public String getCam() {
        return cam;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "cpu='" + cpu + '\'' +
                ", mem='" + mem + '\'' +
                ", disk='" + disk + '\'' +
                ", cam='" + cam + '\'' +
                '}';
    }
}
