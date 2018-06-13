package com.torres.jvm.chapter7;

/**
 * Created by Torres on 2018-06-13 19:06.
 */
public class Test {

        static {
            i = 0;  //  给变量复制可以正常编译通过
//            System.out.print(i);
            // 这句编译器会提示“非法向前引用”
        }
        static int i = 1;
    }



