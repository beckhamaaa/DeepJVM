package com.torres.jvm.chapter4;

/**
 * Created by Torres on 2018-06-13 18:50.
 */
public class Bar {

        int a = 1;
        static int b = 2;

        public int sum(int c) {
            return a + b + c;
        }

        public static void main(String[] args) {
            new Bar().sum(3);
        }
    }

