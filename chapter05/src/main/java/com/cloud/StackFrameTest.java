package com.cloud;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/4/24
 * @Time 5:20
 */
public class StackFrameTest {
    public static void main(String[] args) {
        StackFrameTest stackFrameTest = new StackFrameTest();
        stackFrameTest.method1();
    }

    public void method1() {
        System.out.println("method1");
        method2();
        System.out.println("method1结束");
        return;
    }

    public int method2() {
        System.out.println("method2");
        int i = 10;
        int m = (int) method3();
        System.out.println("method2即将结束");
        return i + m;
    }

    public double method3() {
        System.out.println("method3");
        double j = 20.0;
        System.out.println("method3即将结束");
        return j;
    }
}
