package com.sean.generictest.test;

import com.sean.generictest.ArrayLag;
import com.sean.generictest.Pair;

/**
 * @Author: sean
 * @Date: 2021/10/13 10:34
 */
public class PairTest1 {
    public static void main(String[] args) {
        String[] words = {"Marry", "had", "a", "little", "lamb"};
        Pair<String> mm = ArrayLag.minmax(words);
        System.out.println("min = " + mm.getFirst());
        System.out.println("max = " + mm.getSecond());
    }
}