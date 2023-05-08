package com.cloud.java;

import java.io.File;

/**
 * @author shkstart
 * @create 2020-09-08 9:10
 * <p>
 * 指令4：对象、数组的创建与访问指令
 */
public class NewTest {
    //1.创建指令
    public void newInstance() {
        Object obj = new Object();
        File file = new File("cloud.avi");
    }

    public void newArray() {
        int[] intArray = new int[10];              // newarray 10 (int)
        Object[] objArray = new Object[10];        // anewarray #2 <java/lang/Object>
        int[][] mintArray = new int[10][10];       //  multianewarray #6 <[[I> dim 2

        String[][] strArray = new String[10][];    // anewarray #7 <[Ljava/lang/String;>
        String[][] strArray2 = new String[10][5];  // multianewarray #8 <[[Ljava/lang/String;> dim 2
    }

    //2.字段访问指令
    public void sayHello() {
        System.out.println("hello");
    }

    public void setOrderId(){
        Order order = new Order();
        order.id = 1001;
        System.out.println(order.id);

        Order.name = "ORDER";
        System.out.println(Order.name);
    }

    //3.数组操作指令
    public void setArray() {
        int[] intArray = new int[10];
        intArray[3] = 20;
        System.out.println(intArray[1]);

        boolean[] arr = new boolean[10];
        arr[1] = true;
    }
    public void arrLength(){

        double[] arr = new double[10];
        System.out.println(arr.length);
    }

    //4.类型检查指令
    public String checkCast(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        } else {
            return null;
        }
    }

}

class Order{
    int id;
    static String name;
}
