package com.company.SingletonDesignPattern;


/**
 * use cases of singleton: -
 *
 * For resources that are expensive to create (like database connection objects)
 * It's good practice to keep all loggers as Singletons which increases performance
 * Classes which provide access to configuration settings for the application
 * Classes that contain resources that are accessed in shared mode
 *
 * The singleton pattern is one of the simplest design patterns. Sometimes we need to have only one instance
 * of our class for example a single DB connection shared by multiple objects as creating a separate DB
 * connection for every object may be costly. Similarly, there can be a single configuration manager or error
 * manager in an application that handles all problems instead of creating multiple managers.
 *
 * Definition:
 * The singleton pattern is a design pattern that restricts the instantiation of a class to one object.
 * Let’s see various design options for implementing such a class. If you have a good handle on static
 * class variables and access modifiers this should not be a difficult task.
 *
 */

public class Singleton1 {

    /**
     * Method 1 : lazy instantiation
     */

    /**
     *
     * Here we have declared getInstance() static so that we can call it without instantiating the class.
     * The first time getInstance() is called it creates a new singleton object and after that it just returns
     * the same object. Note that Singleton obj is not created until we need it and call getInstance() method.
     * This is called lazy instantiation.
     *
     * The main problem with above method is that it is not thread safe.
     *
     *
     */

    private static Singleton1 singleton;

    private Singleton1() {

    }

    public static Singleton1 getInstance() {
        if(singleton == null)
            singleton = new Singleton1();
        return singleton;
    }
}
