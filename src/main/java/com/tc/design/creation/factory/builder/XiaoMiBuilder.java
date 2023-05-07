package com.tc.design.creation.factory.builder;

import lombok.NoArgsConstructor;

/**
 * @ClassName XiaoMiBuilder
 * @Description TODO
 * @Author 陶晨
 * @Date 2023-05-07 13:54
 * @Version 1.0
 **/

public class XiaoMiBuilder extends AbstractBuilder{

    public XiaoMiBuilder() {
    }

    @Override
    AbstractBuilder customCpu(String cpu) {
        phone.cpu = cpu;
        return this;
    }

    @Override
    AbstractBuilder customMem(String mem) {
        phone.mem = mem;
        return this;
    }

    @Override
    AbstractBuilder customDisk(String disk) {
        phone.disk = disk;
        return this;
    }

    @Override
    AbstractBuilder customCam(String cam) {
        phone.cam = cam;
        return this;
    }
}
