package com.cloud;

import java.util.Date;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/4/24
 * @Time 6:06
 */
public class LocalVariablesTest {
    private int count = 0;

    public static void main(String[] args) {
        LocalVariablesTest localVariablesTest = new LocalVariablesTest();
        int num = 10;
//        localVariablesTest.test1();
    }


    public LocalVariablesTest() {
        this.count = 1;
    }

    public void test1() {
        Date date = new Date();
        String name1 = "cloud1";
        String info = test2(date, name1);
        System.out.println(date + name1);
    }

    public String test2(Date dateP, String name2) {
        dateP = null;
        name2 = "cloud2";
        double weight = 130.5;
        char gender = '男';
        return dateP + name2;
    }

    public void test3() {
        this.count++;
    }
    public void test4() {
        int a = 0;
        {
            int b = 0;
            b = a + 1;
        }
        int c = a + 1;
    }

    public static void test5() {
        int x = 16;
        Date date = new Date();
    }

//    public void test6() {
//        int num;
//        System.out.println(num);
//    }
}
