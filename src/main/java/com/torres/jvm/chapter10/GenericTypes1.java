package com.torres.jvm.chapter10;

import java.util.List;

/**
 * Created by Torres on 2018-06-13 19:49.
 */
public class GenericTypes1 {

        public static void method(List<String> list) {
            System.out.println("invoke method(List<String> list)");
        }

        public static void method(List<Integer> list) {
            System.out.println("invoke method(List<Integer> list)");
        }
    }



