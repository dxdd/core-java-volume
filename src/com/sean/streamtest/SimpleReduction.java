package com.sean.streamtest;

import com.sean.utils.StreamUtils;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * 1.6 简单约简
 *
 * @Author: sean
 * @Date: 2021/9/6 17:06
 */
public class SimpleReduction {

    public static void main(String[] args) throws IOException {
        Path path = Paths.get(StreamUtils.TEST_FILE_PATH);
        String content = new String(Files.readAllBytes(path), StandardCharsets.UTF_8);
        Stream<String> words = Stream.of(content.split("\n"));
//        Optional<String> largest = words.parallel().max(String::compareToIgnoreCase);
//        System.err.println("largest: " + largest.orElse(""));

        Optional<String> startWithQ = words.parallel().filter(w -> w.startsWith("Q")).findFirst();
        System.err.println("startWithQ: " + startWithQ.orElse(""));
        System.err.println(startWithQ.get());

/*        boolean aWordStartsWithQ = words.parallel().anyMatch(w -> w.startsWith("Q"));
        System.err.println(aWordStartsWithQ);*/
    }
}
