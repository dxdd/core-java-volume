package com.sean.extendstest;

/**
 * @Author: sean
 * @Date: 2021/10/11 14:57
 */
public class Student extends Person {
    private String major;

    public Student(String name, String major) {
        super(name);
        this.major = major;
    }

    @Override
    public String getDescription() {
        System.err.println("fsdf");
        return "a student majoring in " + major;
    }
}
