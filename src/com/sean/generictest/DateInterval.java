package com.sean.generictest;

import java.time.LocalDate;

/**
 * @Author: sean
 * @Date: 2021/10/13 15:14
 */
public class DateInterval extends Pair<LocalDate> implements Cloneable{
    @Override
    public void setSecond(LocalDate second) {
        if (second.compareTo(getFirst()) >= 0)
            super.setSecond(second);
    }

    @Override
    public LocalDate getSecond() {
        return super.getSecond();
    }

}
