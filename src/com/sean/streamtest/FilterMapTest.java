package com.sean.streamtest;

import com.sean.utils.StreamUtils;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @Author: sean
 * @Date: 2021/9/3 17:37
 */
public class FilterMapTest {
    public static void main(String[] args) throws IOException {
        String str = new String(Files.readAllBytes(Paths.get(StreamUtils.TEST_FILE_PATH)),
                StandardCharsets.UTF_8);
        List<String> list = Arrays.asList(str.split("\n"));
        //  Stream<T> filter(Predicate<? super T> predicate) : 产生一个流，其中包含当前流满足P的所有元素
        // long count()  产生当前流中元素的数量。是一个终止操作。
        long count = list.stream().filter(v -> v.length() > 5).count();
        System.err.println(count);

        //<R> Stream<R> map(Function<? super T, ? extends R> mapper);
        // 产生一个流，包含将mapper应用于当前流中所有元素所产生的结果。
        Stream<String> lowercaseWords = list.stream().map(String::toUpperCase);
        StreamUtils.show("lowercaseWords", lowercaseWords);

        Stream<String> firstLetters = list.stream().map(s -> s.substring(0, 1));
        StreamUtils.show("firstLetters", firstLetters);

        Stream<Stream<String>> result = list.stream().map(StreamUtils::letters);
        StreamUtils.show("result", result);

        //<R> Stream<R> flatMap(Function<? super T, ? extends Stream<? extends R>> mapper);
        // 产生一个流，包含将mapper应用于当前流中所有元素所产生的结果连接到一起而获得的。
        Stream<String> result1 = list.stream().flatMap(StreamUtils::letters);
        StreamUtils.show("result1", result1);
    }


}
