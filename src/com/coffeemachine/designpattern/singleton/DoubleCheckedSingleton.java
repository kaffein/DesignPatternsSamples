package com.coffeemachine.designpattern.singleton;

/**
 * Created by IntelliJ IDEA.
 * User: nasoloaina
 * Date: 8/31/11
 * Time: 8:45 PM
 * To change this template use File | Settings | File Templates.
 */
public class DoubleCheckedSingleton {
    private volatile static DoubleCheckedSingleton instance;

    private DoubleCheckedSingleton() {
    }

    public static DoubleCheckedSingleton getInstance() {
        if(instance == null) {
            synchronized (DoubleCheckedSingleton.class) {
                if(instance == null) {
                    instance = new DoubleCheckedSingleton();
                }
            }
        }

        return instance;
    }
}
