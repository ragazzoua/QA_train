package com.company;

import java.io.IOException;
import java.util.Random;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException {
        Random random = new Random();
        System.out.println(random.ints(46, 87)
                .limit(100)
                .mapToObj(q -> (char) q + "")
                .collect(Collectors.joining()));
    }
}
