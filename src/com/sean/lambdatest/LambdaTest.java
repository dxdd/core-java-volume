package com.sean.lambdatest;

import javax.swing.*;
import java.util.Arrays;
import java.util.Date;

/**
 * @Author: sean
 * @Date: 2021/10/12 16:26
 */
public class LambdaTest {
    public static void main(String[] args) {
        String[] planets = new String[]{"Mercury", "venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};
        System.out.println(Arrays.toString(planets));
        System.out.println("按照字典排序");
        Arrays.sort(planets);
        System.out.println(Arrays.toString(planets));
        System.out.println("按照长度排序");
        Arrays.sort(planets, (first, second) -> first.length() - second.length());
        System.out.println(Arrays.toString(planets));

        Timer t = new Timer(1000, event -> System.out.println("The time is " + new Date()));
        t.start();

        JOptionPane.showMessageDialog(null, "Quit program?");
        System.exit(0);
    }
}
