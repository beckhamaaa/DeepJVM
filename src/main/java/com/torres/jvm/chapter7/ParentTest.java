package com.torres.jvm.chapter7;

/**
 * Created by Torres on 2018-06-13 19:06.
 */
public class ParentTest {

    static class Parent {
        public static int A = 1;
        static {
            A = 2;
        }
    }

    static class Sub extends Parent {
        public static int B = A;
    }

    public static void main(String[] args) {
        System.out.println(Sub.B);
    }


}
