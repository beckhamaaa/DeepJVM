package com.torres.jvm.chapter10;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Torres on 2018-06-13 19:49.
 */
public class GenericTypes2 {


        public static String method(List<String> list) {
            System.out.println("invoke method(List<String> list)");
            return "";
        }

        public static int method(List<Integer> list) {
            System.out.println("invoke method(List<Integer> list)");
            return 1;
        }

        public static void main(String[] args) {
            method(new ArrayList<String>());
            method(new ArrayList<Integer>());
        }
    }


