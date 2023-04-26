package com.cloud;

import java.sql.DriverManager;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/4/23
 * @Time 3:54
 */
public class ClassLoaderTest {

    public static void main(String[] args) {
        // 获取系统类加载器
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        System.out.println(systemClassLoader);

        // 获取其上层: 扩展类加载器
        ClassLoader extClassLoader = systemClassLoader.getParent();
        System.out.println(extClassLoader);

        // 获取其上层: 引导类加载器
        ClassLoader parent1 = extClassLoader.getParent();
        System.out.println(parent1);

        // 对于用户自定义类来说，使用哪个类加载器来加载的
        System.out.println(ClassLoaderTest.class.getClassLoader());
        System.out.println(String.class.getClassLoader()); // null
    }

}
