package com.sean.interfacetest.test;

import com.sean.interfacetest.Employee;

/**
 * @Author: sean
 * @Date: 2021/10/12 13:58
 */
public class CloneTest {
    public static void main(String[] args) {
        Employee original = new Employee("John Q. Public", 50000);
        original.setHireDay(2000, 1, 1);
        Employee copy = original.clone();
        copy.raiseSalary(10);
        copy.setHireDay(2002, 13, 31);
        System.out.println("original= " + original);
        System.out.println("copy = " + copy);
    }
}
