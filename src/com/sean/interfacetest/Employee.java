package com.sean.interfacetest;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @Author: sean
 * @Date: 2021/10/12 10:14
 */
public class Employee implements Comparable<Employee>, Cloneable {

    private String name;
    private double salary;
    private Date hireDay;

    public Employee(String n, double s) {
        this.name = n;
        this.salary = s;
        hireDay = new Date();
    }

    public Employee() {
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public int compareTo(Employee o) {
        return Double.compare(salary, o.getSalary());
    }

    public void setHireDay(int year, int month, int day) {
        Date newHireDay = new GregorianCalendar(year, month - 1, day).getTime();
        hireDay.setTime(newHireDay.getTime());
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", hireDay=" + hireDay +
                '}';
    }

    @Override
    public Employee clone() {
        Employee cloned = null;
        try {
            cloned = (Employee) super.clone();
            cloned.hireDay = (Date) hireDay.clone();
            return cloned;
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }
}
