package com.cloud;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/4/29
 * @Time 12:23
 */
public class StringTest2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("words.txt"));
        long start = System.currentTimeMillis();
        String data;
        while ((data = bufferedReader.readLine()) != null) {
            data.intern(); // 往字符串常量池中放
        }
        long end = System.currentTimeMillis();
        System.out.println("花费的时间: " + (end - start));

        bufferedReader.close();
    }
}
