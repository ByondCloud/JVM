package com.cloud;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/4/29
 * @Time 16:17
 */
/**
 * StringIntern.java中练习的拓展：
 *
 */
public class StringIntern1 {
    public static void main(String[] args) {
        String s3 = new String("1") + new String("1");
        String s4 = "11";
        String s5 = s3.intern();
        System.out.println(s5 == s4);//true
    }
}
