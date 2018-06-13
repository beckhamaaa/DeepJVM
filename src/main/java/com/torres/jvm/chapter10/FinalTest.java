package com.torres.jvm.chapter10;

/**
 * Created by Torres on 2018-06-13 19:49.
 */
public class FinalTest {

    // 方法一带有final修饰
    public void foo(final int arg) {
        final int var = 0;
        // do something
    }

    // 方法二没有final修饰
    public void foo(int arg) {
        int var = 0;
        // do something
    }


}
