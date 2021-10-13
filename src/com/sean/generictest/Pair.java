package com.sean.generictest;

import java.util.function.Supplier;

/**
 * @Author: sean
 * @Date: 2021/10/13 9:59
 */
public class Pair<T> {
    private T first;
    private T second;

    public Pair() {
        first = null;
        second = null;
    }

    public Pair(T first, T second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T newValue) {
        this.first = newValue;
    }

    public T getSecond() {
        return second;
    }

    public void setSecond(T newValue) {
        this.second = newValue;
    }

    public static <T> Pair<T> makePair(Supplier<T> constr) {
        return new Pair<>(constr.get(), constr.get());
    }

    public static <T> Pair<T> makePair(Class<T> cl) {
        try {
            return new Pair<>(cl.newInstance(), cl.newInstance());
        } catch (InstantiationException | IllegalAccessException e) {
            return null;
        }
    }
}
