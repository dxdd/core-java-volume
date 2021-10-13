package com.sean.extendstest;

/**
 * @Author: sean
 * @Date: 2021/10/11 9:56
 */
public class Manager extends Employee {
    private double bonus;

    private int year;
    private int month;
    private int day;

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double getSalary() {
        return super.getSalary() + bonus;
    }

    public Manager(String n, double s) {
        super(n, s);
        bonus = 0;
    }

    public Manager(String n, double s,  int year, int month, int day) {
        super(n, s);
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public double getBonus() {
        return bonus;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }
}
