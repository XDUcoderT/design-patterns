package com.tc.design.creation.factory.builder;

/**
 * @ClassName AbStractBuilder
 * @Description TODO
 * @Author 陶晨
 * @Date 2023-05-07 13:52
 * @Version 1.0
 **/
public abstract class AbstractBuilder {
    Phone phone;

    abstract AbstractBuilder customCpu(String cpu);
    abstract AbstractBuilder customMem(String mem);
    abstract AbstractBuilder customDisk(String disk);
    abstract AbstractBuilder customCam(String cam);

}
