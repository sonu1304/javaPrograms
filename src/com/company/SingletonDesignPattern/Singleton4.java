package com.company.SingletonDesignPattern;

public class Singleton4 {

    /**
     *
     * Method 4 (Best): Use “Double Checked Locking”
     *
     * If you notice carefully once an object is created synchronization is no longer useful because now obj
     * will not be null and any sequence of operations will lead to consistent results.
     * So we will only acquire lock on the getInstance() once, when the obj is null. This way we only
     * synchronize the first way through, just what we want.
     *
     * We have declared the obj volatile which ensures that multiple threads offer the obj variable correctly
     * when it is being initialized to Singleton instance. This method drastically reduces the overhead of
     * calling the synchronized method every time.
     *
     */


    private static volatile Singleton4 singleton;

    private Singleton4() {}

    public static Singleton4 getInstance() {

        if(singleton == null) {

            //for thread safety...
            synchronized (Singleton4.class) {

                //checking again as multiple threads can reach above step
                if(singleton == null)
                    singleton = new Singleton4();
            }
        }

        return singleton;
    }
}
