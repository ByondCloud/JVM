package com.cloud.test;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/4/25
 * @Time 2:27
 */
public class Test2 {
    public static void main(String[] args) {
        Kid kid = new Son();
        kid.ask();
    }
}

class Father {
    public void ask() {
        System.out.println("父亲讲话");
    }
}

interface Action {
    void ask();
}
abstract class Kid extends Father implements Action {

}

class Son extends Kid {
    @Override
    public void ask() {
        System.out.println("儿子讲话");
    }

}

