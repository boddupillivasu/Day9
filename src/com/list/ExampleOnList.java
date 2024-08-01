package com.list;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ExampleOnList {
    public static void main(String[] args) {

        List<String> ref1 = Arrays.asList("java", "c", "c++", "go", "javascript", "python", "scala");
        System.out.println("input list of String:" + ref1);


        List<String> listOfStringStartJ = ref1.stream().filter(i -> i.startsWith("j")).collect(Collectors.toUnmodifiableList());
        System.out.println(listOfStringStartJ);
        Map<String, Integer> stringMap = ref1.stream().collect(Collectors.toMap(Function.identity(), String::length));
        System.out.println("map of String and their is length:" + stringMap);
    }
}
