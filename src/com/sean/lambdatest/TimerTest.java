package com.sean.lambdatest;

import javax.swing.*;
import java.awt.event.ActionListener;

/**
 * @Author: sean
 * @Date: 2021/10/12 16:02
 */
public class TimerTest {

    public static void main(String[] args) {
        ActionListener listener = new TimePrinter();
        Timer t = new Timer(10000, listener);
        t.start();
        JOptionPane.showMessageDialog(null, "Quit program");
        System.exit(0);
    }
}
