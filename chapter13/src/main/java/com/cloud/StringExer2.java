package com.cloud;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/4/29
 * @Time 16:45
 */
public class StringExer2 {
    public static void main(String[] args) {
        String s1 = new String("ab"); // 堆地址
        s1.intern(); // 常量池中有ab，所以啥也没干
        String s2 = "ab"; // 常量池中的地址
        System.out.println(s1 == s2); // 堆地址 != 常量池地址
    }
}
