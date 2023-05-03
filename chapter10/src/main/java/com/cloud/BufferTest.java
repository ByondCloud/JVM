package com.cloud;

import java.nio.ByteBuffer;
import java.util.Scanner;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/4/29
 * @Time 6:36
 */
public class BufferTest {

    private static final int BUFFER = 1024 * 1024 * 1024; // 1GB

    public static void main(String[] args) {
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(BUFFER);
        System.out.println("直接分配内存");

        Scanner scanner = new Scanner(System.in);
        scanner.next();

        System.out.println("释放内存");
        byteBuffer = null;
        System.gc(); // GC
        scanner.next();
    }
}
