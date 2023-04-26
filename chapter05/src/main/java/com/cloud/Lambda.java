package com.cloud;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/4/25
 * @Time 1:49
 */

@FunctionalInterface
interface Func {
    public boolean func(String str);
}

public class Lambda {
    public void method(Func func) {
        return;
    }

    public static void main(String[] args) {
        Lambda lambda = new Lambda();
        // 生成接口对象
        Func func = s -> {
            return true;
        };
        lambda.method(func);

        // 生成接口匿名对象
        lambda.method(s -> {
            return true;
        });
    }
}


