package com.sean.basicprogrammingstructure;

/**
 * @Author: sean
 * @Date: 2021/10/9 11:51
 */
public class Message {
    public static void main(String[] args) {
        if (args.length == 0 || "-h".equals(args[0])) {
            System.out.println("Hello,");
        } else if ("-g".equals(args[0])) {
            System.out.println("Goodbye,");
        }
        for (String arg : args) {
            System.out.println(" " + arg);
        }
        System.out.println("!");
    }

    public static int age;

    static {
        age = 23;
    }


    {
        name = "老总";
    }

    private String name;

    public Message(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}