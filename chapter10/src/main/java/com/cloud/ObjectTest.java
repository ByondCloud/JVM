package com.cloud;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/4/27
 * @Time 14:23
 */
public class ObjectTest {
    public static void main(String[] args) {
        Object o = new Object();
        A a = new A();
    }



}

class A {


    public A() {
        System.out.println("constructor");
    }
    static {
        System.out.println("static");
    }
}
