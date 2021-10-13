package com.sean.generictest;

/**
 * @Author: sean
 * @Date: 2021/10/13 17:40
 */
public class PairAlg {
    public static boolean hasNull(Pair<?> p) {
        return p.getFirst() == null || p.getSecond() == null;
    }

    public static void swap(Pair<?> p) {
        swapHelper(p);
    }

    public static <T> void swapHelper(Pair<T> p) {
        T t = p.getFirst();
        p.setFirst(p.getSecond());
        p.setSecond(t);
    }
}
