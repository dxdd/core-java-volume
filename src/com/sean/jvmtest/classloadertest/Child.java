package com.sean.jvmtest.classloadertest;

/**
 * @Author: sean
 * @Date: 2021/9/9 10:36
 */
public class Child extends Parent{
    static {
        System.out.println("Child init");
    }
}
