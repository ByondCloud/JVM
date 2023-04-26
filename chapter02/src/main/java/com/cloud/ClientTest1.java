package com.cloud;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/4/23
 * @Time 3:18
 */
public class ClientTest1 {

    static class Father {
        public static int A = 1;
        static {
            A = 2;
        }
    }

    static class Son extends Father {
        public static int B = A;
    }

    public static void main(String[] args) {
        System.out.println(Son.B);
    }


}
