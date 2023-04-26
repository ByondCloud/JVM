package com.cloud;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/4/25
 * @Time 0:54
 */
public class Test2 {
    public static void main(String[] args){
        Son1.print("coder"); // 非虚方法
    }
}

class Father1 {
    public static void print(String str){
        System. out. println("father "+str);
    }
    private void show(String str){
        System. out. println("father"+str);
    }
}
class Son1 extends Father1 {

}
