package com.cloud;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/4/29
 * @Time 11:30
 */
public class GenerateString {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("words.txt");

        for (int i = 0; i < 100000; i++) {
            int length = (int)(Math.random() * (10 - 1 + 1) + 1);
            fileWriter.write(getString(length) + "\n");
        }
        fileWriter.close();
    }


    public static String getString(int length) {

        String str = "";
        for (int i = 0; i < length; i++) {
            //                  确定范围                                随机大小写
            int num = (int)(Math.random() * (90 - 65 + 1) + 65) + (int)(Math.random() * 2) * 32;
            str += (char)num;
        }
        return str;
    }
}
