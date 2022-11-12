package com.company.SingletonDesignPattern;

public class Singleton2 {

    /**
     * Method 2: make getInstance() synchronized
     */

    /**
     *
     * Here using synchronized makes sure that only one thread at a time can execute getInstance().
     * The main disadvantage of this is method is that using synchronized every time while creating the
     * singleton object is expensive and may decrease the performance of your program. However if performance
     * of getInstance() is not critical for your application this method provides a clean and simple solution.
     *
     */

    private static Singleton2 singleton;

    private Singleton2() {}

    /** only one thread can execute this at a time */
    public static synchronized Singleton2 getInstance() {

        if(singleton == null)
            singleton = new Singleton2();
        return singleton;
    }

}
