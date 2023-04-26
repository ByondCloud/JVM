package com.cloud;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/4/24
 * @Time 23:40
 */
public class DynamicLinkingTest {

    int num = 10;

    public void methodA() {
        System.out.println("methodA");
    }

    public void methodB() {
        System.out.println("methodB");
        methodA();
        num++;
    }

}
