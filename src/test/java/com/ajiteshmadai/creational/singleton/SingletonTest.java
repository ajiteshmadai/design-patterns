package com.ajiteshmadai.creational.singleton;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SingletonTest  {

    @Test
    public void testGetInstance() {
        //Singleton singleton = new Singleton();
        String value = Singleton.getInstance();
        String anotherValue = Singleton.getInstance();
        Assertions.assertEquals(value, "singleton");
        Assertions.assertEquals(value, anotherValue);
    }

    @Test
    public void testThreadSafeGetInstance() {
        //Singleton singleton = new Singleton();
        String value = ThreadSafeSingleton.getInstance();
        String anotherValue = ThreadSafeSingleton.getInstance();
        Assertions.assertEquals(value, "singleton");
        Assertions.assertEquals(value, anotherValue);
    }
}