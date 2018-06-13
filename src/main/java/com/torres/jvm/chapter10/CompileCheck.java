package com.torres.jvm.chapter10;

/**
 * Created by Torres on 2018-06-13 19:40.
 */
public class CompileCheck {


    public static void main(String[] args) {
        // 编译器将会提示“Unreachable code”
        while (false) {
            System.out.println("");
        }
    }


}
