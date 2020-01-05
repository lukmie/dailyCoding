package com.lukmie.zad3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static final Post POST_1 = new Post("Java 8 wprowadza strumienie",
            "java 8, strumienie", 519,
            new Comment("Super!"),
            new Comment("Leniwe przetwarzanie, mega :)"));

    public static final Post POST_2 = new Post("Nowe API dla plików NIO",
            "java 8, file api,nio api", 7220);

    public static final Post POST_3 = new Post("Przetwarzanie równoległe strumieni",
            "JAVA 8,STRUMIENIE", 3125,
            new Comment("WOW!"));

    public static final Post POST_4 = new Post("NullPointerException? Poznaj Optional",
            "java 8,null pointer exception,optional", 3125,
            new Comment("No, teraz to będę miał problem z głowy"));

    public static final List<Post> posts = new ArrayList<>(Arrays.asList(POST_1, POST_2, POST_3, POST_4));
    public static void main(String[] args) {
        met1();

    }

    public static void met1() {
        posts.stream()
                .map(Post::getSubject)
                .forEach(System.out::println);
    }
}
