package com.lukmie.zad3;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static final Post POST_1 = new Post("Java 8 wprowadza strumienie",
            "java 8, strumienie", 519,
            new Comment("Super!"),
            new Comment("Leniwe przetwarzanie, mega :)"));

    public static final Post POST_2 = new Post("Nowe API dla plików NIO",
            "java 8, file api, nio api", 7220);

    public static final Post POST_3 = new Post("Przetwarzanie równoległe strumieni",
            "JAVA 8,STRUMIENIE", 3125,
            new Comment("WOW!"));

    public static final Post POST_4 = new Post("NullPointerException? Poznaj Optional",
            "java 8,null pointer exception,optional", 3125,
            new Comment("No, teraz to będę miał problem z głowy"));

    public static final List<Post> posts = new ArrayList<>(Arrays.asList(POST_1, POST_2, POST_3, POST_4));
    public static void main(String[] args) {
//        met1();
//        met2a();
//        met2b();
//        met2c();
//        met3a();
//        met4();
//        met5();
//        met10();
//        met13();
        met15();

    }

    public static void met1() {
        posts.stream()
                .map(Post::getSubject)
                .forEach(System.out::println);
    }

    public static void met2a() {
        posts.stream()
                .map(Post::getAmountOfSigns)
                .sorted()
                .forEach(System.out::println);
    }

    public static void met2b() {
        posts.stream()
                .map(Post::getAmountOfSigns)
                .sorted(Collections.reverseOrder())
                .forEach(System.out::println);
    }

    public static void met2c() {
        posts.stream()
                .collect(Collectors.toMap(Post::getAmountOfSigns, Post::getSubject, (k1, k2) -> k1 + ", " + k2))
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(k -> System.out.println(k.getKey() + " - " + k.getValue()));
    }

    public static void met3() {
        posts.stream()
                .map(Post::getSubject)
                .limit(2)
                .forEach(System.out::println);
    }

    public static void met4() {
        posts.stream()
                .map(Post::getSubject)
                .skip(2)
                .forEach(System.out::println);
    }

    public static void met5() {
        posts.stream()
                .filter(post -> post.getAmountOfSigns() < 500)
                .map(Post::getSubject)
                .forEach(System.out::println);
    }

    public static void met6() {
        posts.stream()
                .filter(post -> post.getSubject().contains("Java"))
                .map(Post::getSubject)
                .forEach(System.out::println);
    }

    public static void met7() {
        boolean allHaveLetterA = posts.stream()
                .allMatch(post -> post.getSubject().contains("a"));
        System.out.println(allHaveLetterA);
    }

    public static void met8() {
        boolean over5k = posts.stream()
                .anyMatch(post -> post.getAmountOfSigns() > 5000);
        System.out.println(over5k);
    }

    public static void met9() {
        boolean over5tags = posts.stream()
                .map(post -> post.getTags().split(","))
                .anyMatch(tags -> tags.length > 5);
        System.out.println(over5tags);
    }

    public static void met10() {
        Optional<String> java = posts.stream()
                .filter(post -> post.getSubject().contains("Java"))
                .map(Post::getSubject)
                .findFirst();
        java.ifPresent(System.out::println);
    }

    public static void met11() {
        Optional<String> java = posts.stream()
                .filter(post -> post.getSubject().contains("elemelek"))
                .map(Post::getSubject)
                .findAny();
        java.ifPresent(System.out::println);
    }

    public static void met12() {
        List<String> subjects = posts.stream()
                .map(Post::getSubject)
                .collect(Collectors.toList());
        subjects.forEach(System.out::println);
    }

    public static void met13() {
        Integer reduce = posts.stream()
                .map(Post::getAmountOfSigns)
//                .reduce(Integer::sum)
                .reduce(0, (p1, p2) -> p1 + p2);
        System.out.println(reduce);
    }

    public static void met14() {
        List<Comment> collect = posts.stream()
                .flatMap(post -> post.getComments().stream())
                .collect(Collectors.toList());
        System.out.println(collect);
    }

    public static void met15() {
        List<String> collect = posts.stream()
                .flatMap(post -> Arrays.stream(post.getTags().toLowerCase().split(",")))
                .distinct()
                .collect(Collectors.toList());
        System.out.println(collect.toString());
    }
}
