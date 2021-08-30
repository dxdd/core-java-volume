package com.sean.streamtest;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class StringLength {
    public static void main(String[] args) throws IOException {
        String str = new String(Files.readAllBytes(Paths.get("src/com/sean/streamtest/StringLength.txt")),
                StandardCharsets.UTF_8);
        List<String> list = Arrays.asList(str.split("\n"));
        long count = list.stream().filter(v -> v.length() > 5).count();
        System.err.println(count);
    }
}