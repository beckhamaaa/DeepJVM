package com.torres.jvm.chapter7.notInitialization1;

/**
 * Created by Torres on 2018-06-13 19:06.
 * 被动使用类字段演示二：
 * 通过数组定义来引用类，不会触发此类的初始化
 */
public class NotInitialization {


        public static void main(String[] args) {
            SuperClass[] sca = new SuperClass[10];
        }

    }

