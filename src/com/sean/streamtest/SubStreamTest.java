package com.sean.streamtest;

import com.sean.utils.StreamUtils;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
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
        StreamUtils.show("words", words);

        Stream<String> combined = Stream.concat(StreamUtils.letters("Hello"),StreamUtils.letters("world"));
        StreamUtils.show("combined", combined);
    }
}
