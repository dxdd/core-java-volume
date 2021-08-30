package com.sean.streamtest;

import java.io.IOException;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.regex.Pattern.*;

/**
 * @Author: sean
 * @Date: 2021/8/30 11:00
 */
public class CreatingStreams {
    /**
     * 打印流
     *
     * @param title  标题
     * @param stream 流
     * @param <T>    流类型
     */
    public static <T> void show(String title, Stream<T> stream) {
        final int size = 10;
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

    public static void main(String[] args) throws IOException {
        Path path = Paths.get("src/com/sean/streamtest/StringLength.txt");
        String content = new String(Files.readAllBytes(path), StandardCharsets.UTF_8);
        Stream<String> words = Stream.of(content.split("\n"));
        show("words", words);

        Stream<String> song = Stream.of("gently", "down", "the", "stream");
        show("song", song);

        Stream<String> silence = Stream.empty();
        show("silence", silence);

        Stream<String> echos = Stream.generate(() -> "Echo");
        show("echos", echos);

        //generate:产生一个无限流，static<T> Stream<T> generate(Supplier<T> s) ，通过循环调用s的操作来执行
        Stream<Double> randoms = Stream.generate(Math::random);
        show("randoms", randoms);

        Stream<BigInteger> integers = Stream.iterate(BigInteger.ONE, n -> n.add(BigInteger.ONE));
        show("integers", integers);

        try (Stream<String> wordsAnotherWay = compile("\n").splitAsStream(content)) {
            show("wordsAnotherWay", wordsAnotherWay);
        }

        try (Stream<String> lines = Files.lines(path, StandardCharsets.UTF_8)) {
            show("lines", lines);
        }
    }
}
