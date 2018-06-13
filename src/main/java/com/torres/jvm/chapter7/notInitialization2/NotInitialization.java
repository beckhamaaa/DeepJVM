package com.torres.jvm.chapter7.notInitialization2;

/**
 * Created by Torres on 2018-06-13 19:13.
 * 非主动使用类字段演示
 */
public class NotInitialization {

    public static void main(String[] args) {
        System.out.println(ConstClass.HELLOWORLD);
    }
}

