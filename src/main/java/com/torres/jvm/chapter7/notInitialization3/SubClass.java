package com.torres.jvm.chapter7.notInitialization3;

/**
 * Created by Torres on 2018-06-13 19:16.
 */
public class SubClass extends SuperClass {

    static {
        System.out.println("SubClass init!");
    }
}
