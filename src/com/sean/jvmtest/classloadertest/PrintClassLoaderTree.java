package com.sean.jvmtest.classloadertest;

/**
 * @Author: sean
 * @Date: 2021/9/9 15:55
 */
public class PrintClassLoaderTree {
    public static void main(String[] args) {
        ClassLoader cl = PrintClassLoaderTree.class.getClassLoader();
        while (cl != null) {
            System.out.println(cl);
            cl = cl.getParent();
        }
    }
}
