package com.torres.jvm.chapter7.notInitialization3;

/**
 * Created by Torres on 2018-06-13 19:15.
 * 被动使用类字段演示一：
 * 通过子类引用父类的静态字段，不会导致子类初始化
 */
public class SuperClass {

    static {
        System.out.println("SuperClass init!");
    }

    public static int value = 123;
}






