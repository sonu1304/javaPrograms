package com.company.SingletonDesignPattern;


public class Singleton3 {

    /**
     * Method 3: Eager Instantiation
     *
     * Here we have created instance of singleton in static initializer. JVM executes static initializer
     * when the class is loaded and hence this is guaranteed to be thread safe. Use this method only when your
     * singleton class is light and is used throughout the execution of your program.
     *
     */

    private static Singleton3 singleton = new Singleton3();

    private Singleton3() {}

    public static Singleton3 getInstance() {
        return singleton;
    }
}
