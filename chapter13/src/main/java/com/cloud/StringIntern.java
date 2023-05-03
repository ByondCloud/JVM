package com.cloud;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/4/29
 * @Time 15:30
 */
public class StringIntern {
    public static void main(String[] args) {
        String s = new String("1");
        s.intern();
        String s2 = "1";
        System.out.println(s==s2); // false

        String s3 = new String("1") + new String("1");
        s3.intern();
        String s4 = "11";
        System.out.println(s3==s4); // true


    }
}
