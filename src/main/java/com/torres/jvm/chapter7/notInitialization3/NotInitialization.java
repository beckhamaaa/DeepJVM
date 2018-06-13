package com.torres.jvm.chapter7.notInitialization3;

/**
 * Created by Torres on 2018-06-13 19:16.
 * 非主动使用类字段演示
 */
public class NotInitialization {

    public static void main(String[] args) {
        System.out.println(SubClass.value);
    }

}
