package com.sean.generictest;


/**
 * @Author: sean
 * @Date: 2021/10/13 11:29
 */
public class ArrayLag {
    /**
     * 普通实现
     *
     * @param a
     * @return
     */
    public static Pair<String> minmax(String[] a) {
        if (a == null || a.length == 0)
            return null;
        String min = a[0];
        String max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (min.compareTo(a[i]) > 0)
                min = a[i];
            if (max.compareTo(a[i]) < 0)
                max = a[i];
        }
        return new Pair<>(min, max);
    }

    public static <T> T getMiddle(T... a) {
        return a[a.length / 2];
    }

    /**
     * 泛型实现
     *
     * @param a
     * @param <T>
     * @return
     */
    public static <T extends Comparable> Pair<T> minmax(T[] a) {
        if (a == null || a.length == 0)
            return null;
        T min = a[0];
        T max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (min.compareTo(a[i]) > 0)
                min = a[i];
            if (max.compareTo(a[i]) < 0)
                max = a[i];
        }
        return new Pair<>(min, max);
    }

    public static <T extends Comparable<? super T>> T min(T[] a){
        return null;
    }
}
