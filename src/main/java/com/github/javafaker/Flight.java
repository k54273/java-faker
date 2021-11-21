package com.github.javafaker;

import java.util.*;
import java.lang.*;

public class Flight {
    private final Faker faker;

    protected Flight(Faker faker) {
        this.faker = faker;
    }

    public int getDigits() {
        int min = 1;
        int max = 9999;

        int digits = (int)(Math.random() * (max - min + 1));

        return digits;
    }

    public String getLetters(int iterations) {
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

    public String getIataFlight() {
        String result = "";
        int iterations = 2;

        int digits = getDigits();
        String letters = getLetters(iterations);
        result = letters + String.valueOf(digits);

        return result;
    }

    public String getIcaoFlight() {
        String result = "";
        int iterations = 3;

        int digits = getDigits();
        String letters = getLetters(iterations);
        result = letters + String.valueOf(digits);

        return result;
    }

    public String getAirlineName() {
        String[] airlineNames = new String[]{"Fly Service", "Global Alliance", "Engineering Space", "Jet Team",
                "Ironclad Air", "Assured Atmosphere", "Arrive Safe", "Premiere Protection", "Sky Shop",
                "Air Innovations", "Capable Craft", "Hightail Demo", "Shift Airways", "Space Safe", "Jet World",
                "Luxury Spot", "Exotic Airline", "Global Traveler", "Airway Moment", "Smart Wing", "Volts Aerospace",
                "Tourism Help", "Aero One", "Safe Escape", "Nonstop Trip", "Homeland Innovations",
                "Economy Speed", "Front Desk", "Tactical Takeoff", "Forge Aerodynamics", "Spark Airways"};

        int min = 0;
        int max = airlineNames.length;

        int index = (int)(Math.random() * (max - min));
        String str = airlineNames[index];

        return str;
    }
}
