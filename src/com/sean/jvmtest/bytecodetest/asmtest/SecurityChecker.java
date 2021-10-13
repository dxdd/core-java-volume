package com.sean.jvmtest.bytecodetest.asmtest;

/**
 * @Author: sean
 * @Date: 2021/9/10 17:56
 */
public class SecurityChecker {
    public static boolean checkSecurity() {
        System.out.println("SecurityChecker.checkSecurity ...");
        return (System.currentTimeMillis() & 0x1) != 0;
    }
}
