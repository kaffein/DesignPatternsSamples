package com.coffeemachine.designpattern.singleton;

/**
 * Created by IntelliJ IDEA.
 * User: nasoloaina
 * Date: 8/31/11
 * Time: 8:50 PM
 * To change this template use File | Settings | File Templates.
 */
public class SynchronizedSingleton {
    private static SynchronizedSingleton instance;

    private SynchronizedSingleton() {
    }

    public static synchronized SynchronizedSingleton getInstance() {
        if(instance == null) {
            instance = new SynchronizedSingleton();
        }

        return instance;
    }
}
