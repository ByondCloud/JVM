package com.cloud;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/4/23
 * @Time 0:57
 */
public class HelloLoader {

    static {
        i = 7;

    }

    private static int i = 9;

    public HelloLoader() {
        i = 10;
    }

    public static void main(String[] args) {
        System.out.println("谢谢ClassLoader加载我");
        System.out.println("大恩大德");
        System.out.println(i);
    }
}
