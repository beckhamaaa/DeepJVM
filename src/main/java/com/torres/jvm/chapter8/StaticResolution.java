package com.torres.jvm.chapter8;

/**
 * Created by Torres on 2018-06-13 19:28.
 * 方法静态解析演示
 */
public class StaticResolution {

        public static void sayHello() {
            System.out.println("hello world");
        }

        public static void main(String[] args) {
            StaticResolution.sayHello();
        }

    }

