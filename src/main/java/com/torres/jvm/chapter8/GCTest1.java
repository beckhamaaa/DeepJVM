package com.torres.jvm.chapter8;

/**
 * Created by Torres on 2018-06-13 19:28.
 */
public class GCTest1 {

    public static void main(String[] args)//()

    {
        {
            byte[] placeholder = new byte[64 * 1024 * 1024];
        }
        int a = 0;
        System.gc();
    }

}
