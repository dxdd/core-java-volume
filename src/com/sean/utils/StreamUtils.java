package com.sean.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Author: sean
 * @Date: 2021/9/3 16:44
 */
public class StreamUtils {

    public static final String TEST_FILE_PATH = "src/com/sean/streamtest/TestFile.txt";

    /**
     * 打印流
     *
     * @param title  标题
     * @param stream 流
     * @param <T>    流类型
     */
    public static <T> void show(String title, Stream<T> stream) {
        final int size = 100;
        List<T> firstElements = stream.limit(size + 1).collect(Collectors.toList());
        System.out.println(title + ": ");
        for (int i = 0; i < firstElements.size(); i++) {
            if (i > 0) {
                System.out.println(", ");
            }
            if (i < size) {
                System.out.println(firstElements.get(i));
            } else {
                System.out.println("...");
            }
        }
        System.out.println();
    }

    public static Stream<String> letters(String s) {
        List<String> strings = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            strings.add(s.substring(i, i + 1));
        }
        return strings.stream();
    }
}
