package com.cloud;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/4/25
 * @Time 0:33
 */
public class AnimalTest {
    public void showAnimal(Animal animal) {
        animal.eat(); // 晚期绑定
    }
    public void showHunt(Huntable h) {
        h.hunt(); // 晚期绑定
    }
}

class Animal {
    public void eat() {
        System.out.println("动物进食");
    }
}

interface Huntable {
    void hunt();
}

class Dog extends Animal implements Huntable {
    @Override
    public void hunt() {
        System.out.println("狗捉耗子多管闲事");
    }

    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }
}

class Cat extends Animal implements Huntable {
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    @Override
    public void hunt() {
        System.out.println("猫捉老鼠天经地义");
    }
}
