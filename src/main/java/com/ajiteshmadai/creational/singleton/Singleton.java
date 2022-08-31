package com.ajiteshmadai.creational.singleton;

public class Singleton {
    private static String value;

    private Singleton() {}

    public static String getInstance() {
        if(value == null) {
            value = "singleton";
        }
        return value;
    }
}
