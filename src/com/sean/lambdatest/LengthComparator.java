package com.sean.lambdatest;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @Author: sean
 * @Date: 2021/10/12 14:52
 */
public class LengthComparator implements Comparator<String> {

    public static void main(String[] args) {
        String[] friends = {"Peter", "paul", "Mary"};
        Arrays.sort(friends, Comparator.comparingInt(String::length));
        System.out.println(Arrays.toString(friends));
    }

    @Override
    public int compare(String first, String second) {
        return first.length() - second.length();
    }
}
