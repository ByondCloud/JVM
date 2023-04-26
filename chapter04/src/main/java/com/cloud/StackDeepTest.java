package com.cloud;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/4/24
 * @Time 4:43
 */
public class StackDeepTest {

    private static int count = 0;

    public static void recursion() {
        count++;
        recursion();
    }

    public static void main(String[] args) {
        try {
            recursion();
        } catch (Throwable e) {
            System.out.println("deep of calling=" + count);
        }

    }
}
