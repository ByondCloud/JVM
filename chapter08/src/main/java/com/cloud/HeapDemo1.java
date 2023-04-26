package com.cloud;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/4/25
 * @Time 5:45
 */
public class HeapDemo1 {
    public static void main(String[] args) {
        System.out.println("start...");
        try {
            Thread.sleep(1000000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("end...");
    }
}
