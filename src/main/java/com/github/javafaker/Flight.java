package com.github.javafaker;

import java.util.*;
import java.lang.*;

public class Flight {
    private final Faker faker;

    protected Flight(Faker faker) {
        this.faker = faker;
    }

    public static int getDigits() {
        int min = 1;
        int max = 9999;

        int digits = (int)(Math.random() * (max - min + 1));

        return digits;
    }

    public static String getLetters(int iterations) {
        String letters = "";
        char first = 'A';
        char last = 'Z';

        for (int i = 0; i < iterations; i++) {
            Random r = new Random();
            char c = (char)(r.nextInt(last - first + 1) + first);
            letters += c;
        }

        return letters;
    }

    public static String getIataFlight() {
        String result = "";
        int iterations = 2;

        int digits = getDigits();
        String letters = getLetters(iterations);
        result = letters + String.valueOf(digits);

        return result;
    }

    public static String getIcaoFlight() {
        String result = "";
        int iterations = 3;

        int digits = getDigits();
        String letters = getLetters(iterations);
        result = letters + String.valueOf(digits);

        return result;
    }
}
