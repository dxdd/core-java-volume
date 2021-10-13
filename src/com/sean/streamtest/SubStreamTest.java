package com.sean.streamtest;

import com.sean.utils.StreamUtils;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.stream.Stream;

/**
 * @Author: sean
 * @Date: 2021/9/3 17:51
 */
public class SubStreamTest {
    public static void main(String[] args) throws IOException {
        Stream<Double> randoms = Stream.generate(Math::random).limit(100);
        StreamUtils.show("randoms", randoms);

        Path path = Paths.get(StreamUtils.TEST_FILE_PATH);
        String content = new String(Files.readAllBytes(path), StandardCharsets.UTF_8);
        Stream<String> words = Stream.of(content.split("\n")).skip(1);
//        StreamUtils.show("words", words);

        Stream<String> combined = Stream.concat(StreamUtils.letters("Hello"), StreamUtils.letters("world"));
        StreamUtils.show("combined", combined);

        Stream<String> uniqueWords = Stream.of("merrily", "merrily", "merrily", "gently").distinct();
        StreamUtils.show("uniqueWords", uniqueWords);

        Stream<String> longestFirst = words.sorted(Comparator.comparing(String::length).reversed());
        StreamUtils.show("longestFirst", longestFirst);

        Object[] powers = Stream.iterate(1.0, p -> p * 2).peek(e -> System.out.println("Fetching " + e)).limit(20).toArray();
        System.err.println(powers[1]);
    }
}
