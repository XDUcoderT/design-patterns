package com.tc.design.creation.singleton;

public class MainTest {
    public static void main(String[] args)  {
        LanHan001 lanHan001 = LanHan001.getLanHan001();
        System.out.println(lanHan001.hashCode());
    }
}
