package com.cloud;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/4/24
 * @Time 4:38
 */
public class StackErrorTest {

    private static int count = 1;

    public static void main(String[] args) {
        System.out.println(count);
        count++;
        main(args);
    }
}
