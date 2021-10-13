package com.sean.generictest.test;

import com.sean.generictest.ArrayLag;
import com.sean.generictest.Pair;

import java.time.LocalDate;

/**
 * @Author: sean
 * @Date: 2021/10/13 11:38
 */
public class PairTest2 {
    public static void main(String[] args) {
        LocalDate[] birthdays = {
                LocalDate.of(1906, 12, 9),
                LocalDate.of(1815, 12, 10),
                LocalDate.of(1903, 12, 3),
                LocalDate.of(1910, 6, 2)
        };
        Pair<LocalDate> mm = ArrayLag.minmax(birthdays);
        System.out.println("min = " + mm.getFirst());
        System.out.println("max = " + mm.getSecond());
    }
}
