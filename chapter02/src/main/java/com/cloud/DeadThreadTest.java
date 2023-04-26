package com.cloud;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/4/23
 * @Time 3:36
 */
public class DeadThreadTest {
    public static void main(String[] args) {
        Runnable r = () -> {
            System.out.println(Thread.currentThread().getName() + "开始");
            DeadThread deadThread = new DeadThread();
            System.out.println(Thread.currentThread().getName() + "结束");
        };
        new Thread(r, "线程1").start();
        new Thread(r, "线程2").start();
    }
}

class DeadThread {
    static {
        if (true) {
            System.out.println(Thread.currentThread().getName() + "初始化类");
            while (true) {

            }
        }
    }
}
