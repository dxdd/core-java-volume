package com.sean.extendstest;

/**
 * @Author: sean
 * @Date: 2021/10/11 14:55
 */
public abstract class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public abstract String getDescription();

    public String getName() {
        return name;
    }
}
