package com.ajiteshmadai.creational.singleton;

public class ThreadSafeSingleton {
    private static volatile String value;

    private ThreadSafeSingleton() {}

    public static String getInstance() {
        if(value == null) {
            synchronized (ThreadSafeSingleton.class) {
                if(value == null) {
                    value = "singleton";
                }
            }

        }
        return value;
    }
}
