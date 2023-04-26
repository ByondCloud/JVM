package com.cloud;

import sun.misc.Launcher;

import java.net.URL;
import java.util.Properties;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/4/23
 * @Time 4:27
 */
public class ClassLoaderTest1 {
    public static void main(String[] args) {
        System.out.println("************* 启动类加载器 *************");
        // 获取Bootstrap ClassLoader能够加载的api的路径
        URL[] urLs = Launcher.getBootstrapClassPath().getURLs();
        for (URL element : urLs) {
            System.out.println(element.toExternalForm());
        }

        System.out.println("************* 扩展类加载器 *************");
        String exDirs = System.getProperty("java.ext.dirs");
        for (String path : exDirs.split(";")) {
            System.out.println(path);
        }
    }
}
