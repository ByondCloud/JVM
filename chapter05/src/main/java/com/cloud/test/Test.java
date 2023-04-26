package com.cloud.test;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/4/25
 * @Time 2:20
 */
interface I {
    void m();
}

class A {
    private void m() {
        System.out.println("Inside Class A");
    }

}

abstract class B extends A implements I {

}

class C extends B {
    public void m() {
        System.out.println("Inside Class C");
    }


}

public class Test {
    public static void main(String... args) {
        B b = new C();
        b.m();
    }
}


