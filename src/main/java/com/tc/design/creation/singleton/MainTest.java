package com.tc.design.creation.singleton;

public class MainTest {
    public static void main(String[] args) {
       Person person1 = Person.xidianjuju();
       Person person2 = Person.xidianjuju();
        System.out.println(person1 == person2);
    }
}
