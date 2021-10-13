package com.sean.interfacetest.test;

import com.sean.interfacetest.Employee;

import java.util.Arrays;

/**
 * @Author: sean
 * @Date: 2021/10/12 10:15
 */
public class EmployeeSortTest {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("Harry Hacker", 35000);
        staff[1] = new Employee("Carl Cracker", 75000);
        staff[2] = new Employee("Tony Tester", 38000);
        Arrays.sort(staff);
        for (Employee employee : staff) {
            System.out.println(employee);
        }
    }
}
