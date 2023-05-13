package com.cloud.java;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/5/12
 * @Time 7:59
 */
public class Test {
    public static void main(String[] args) throws ClassNotFoundException {

        System.out.println(Class.forName("com.cloud.java.Test").getClassLoader());

        // 获取当前类的 ClassLoader
//        clazz.getClassLoader();

// 获得当前线程上下文的 ClassLoader
        System.out.println(Thread.currentThread().getContextClassLoader());

// 获得系统的 ClassLoader
        System.out.println(ClassLoader.getSystemClassLoader());
    }
}
