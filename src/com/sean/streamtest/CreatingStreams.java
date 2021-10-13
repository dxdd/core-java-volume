package com.sean.streamtest;

import com.sean.utils.StreamUtils;

import java.io.IOException;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

import static java.util.regex.Pattern.compile;

/**
 * @Author: sean
 * @Date: 2021/8/30 11:00
 */
public class CreatingStreams {

    public static void main(String[] args) throws IOException {
        Path path = Paths.get(StreamUtils.TEST_FILE_PATH);
        String content = new String(Files.readAllBytes(path), StandardCharsets.UTF_8);
        Stream<String> words = Stream.of(content.split("\n"));
        StreamUtils.show("words", words);

        Stream<String> song = Stream.of("gently", "down", "the", "stream");
        StreamUtils.show("song", song);

        Stream<String> silence = Stream.empty();
        StreamUtils.show("silence", silence);

        Stream<String> echos = Stream.generate(() -> "Echo");
        StreamUtils.show("echos", echos);

        //generate:产生一个无限流，static<T> Stream<T> generate(Supplier<T> s) ，通过循环调用s的操作来执行
        Stream<Double> randoms = Stream.generate(Math::random);
        StreamUtils.show("randoms", randoms);

        Stream<BigInteger> integers = Stream.iterate(BigInteger.ONE, n -> n.add(BigInteger.ONE));
        StreamUtils.show("integers", integers);

        try (Stream<String> wordsAnotherWay = compile("\n").splitAsStream(content)) {
            StreamUtils.show("wordsAnotherWay", wordsAnotherWay);
        }

        try (Stream<String> lines = Files.lines(path, StandardCharsets.UTF_8)) {
            StreamUtils.show("lines", lines);
        }
    }
}
