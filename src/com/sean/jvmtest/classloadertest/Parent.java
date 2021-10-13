package com.sean.jvmtest.classloadertest;

/**
 * @Author: sean
 * @Date: 2021/9/9 10:36
 */
public class Parent {

    public static int v = 100;

    static {
        System.out.println("Parent init");
    }
}