package com.cloud.test2;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/4/25
 * @Time 3:39
 */
public class VirtualMethodTable {
}

interface Friendly{
    void sayHello();
    void sayGoodbye();
}
class Dog{
    public void sayHello(){
    }
    public String tostring(){
        return "Dog";
    }
}
class Cat implements Friendly {
    public void eat() {
    }
    public void sayHello() {
    }
    public void sayGoodbye() {
    }
    protected void finalize() {
    }
}
class CockerSpaniel extends Dog implements Friendly{
    public void sayHello() {
        super.sayHello();
    }
    public void sayGoodbye() {
    }
}
