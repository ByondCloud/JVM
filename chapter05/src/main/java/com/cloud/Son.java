package com.cloud;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/4/25
 * @Time 1:03
 */
class Father {
    public Father() {
        System.out.println("father的构造器");
    }

    public static void showStatic(String str) {
        System.out.println("father " + str);
    }

    public final void showFinal() {
        System.out.println("father show final");
    }

    public void showCommon() {
        System.out.println("father 普通方法");
    }
}

public class Son extends Father {

    public static void main(String[] args) {
        Son so = new Son();
        so.show();
    }

    public Son() {
        // 子类构造器调用父类无参构造，属于非虚方法【invokespecial】
        super();
    }

    public Son(int age) {
        // 有参调用无参，属于非虚方法【invokespecial】
        this();
    }

    //不是重写的父类的静态方法，因为静态方法不能被重写！只不过方法名一样了而已
    public static void showStatic(String str) {
        System.out.println("son " + str);
    }

    private void showPrivate(String str) {
        System.out.println("son private" + str);
    }

    public void info() {

    }

    public void display(Father f) {
        f.showCommon();
    }

    public void show() {
        // 有static，非虚方法 【invokestatic】
        showStatic("atguigu.com");

        // 明确了是父类的方法，非虚方法【invokestatic】
        super.showStatic("good!");

        //调用了私有方法，也是非虚方法【invokespecial】
        showPrivate("hello!");

        //明确了是父类的方法，非虚方法【invokespecial】
        super.showCommon();

        // 父类的这个方法被final修饰，不能被子类重写，所以也是非虚方法【invokevirtual】
        showFinal();


        // 没有super，并且不是static，也不是final，也不是private，
        // 如果这个类被继承，Son的子类去重写了这个方法，那么就是多态
        // 因此编译期间确定不了，是虚方法【invokevirtual】
        showCommon();
        // 同上，是虚方法【invokevirtual】
        info();

        // 接口实现类的方法，因此在编译期间也无法确定下来
        // 是虚方法【invokeinterface】
        MethodInterface in = null;
        in.methodA();
    }

}

interface MethodInterface {
    void methodA();
}
