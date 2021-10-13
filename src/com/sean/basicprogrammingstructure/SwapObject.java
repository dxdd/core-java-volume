package com.sean.basicprogrammingstructure;

/**
 * @Author: sean
 * @Date: 2021/10/10 16:42
 */
class SwapObject {
    public static void main(String[] args) {
        Message message1 = new Message("老王");
        Message message2 = new Message("老李");
        swap(message1, message2);
        System.err.println(message1.getName());
        System.err.println(message2.getName());
    }

    public static void swap(Message x, Message y) {
//        String temp = message1.getName();
//        message1.setName(message2.getName());
//        message2.setName(temp);
        Message temp = x;
        x = y;
        y = temp;
    }
}
