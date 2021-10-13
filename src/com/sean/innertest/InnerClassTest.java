package com.sean.innertest;

import javax.swing.*;

/**
 * @Author: sean
 * @Date: 2021/10/12 18:14
 */
public class InnerClassTest {
    public static void main(String[] args) {
        TalkingClock clock = new TalkingClock(1000,true);
        clock.start();

        JOptionPane.showMessageDialog(null,"Quit program?");
        System.exit(0);
    }
}
