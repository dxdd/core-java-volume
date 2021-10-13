package com.sean.reflection;

/**
 * @Author: sean
 * @Date: 2021/9/16 17:24
 */
public class Cat {
    private String name = "招财猫";
    public int age = 10;

    public void hi() {
//        System.out.println("hi " + name);
    }

    public void cry() {
        System.out.println(name + " 喵喵叫");
    }

    public Cat(String name) {
        this.name = name;
    }

    public Cat() {
    }
}
