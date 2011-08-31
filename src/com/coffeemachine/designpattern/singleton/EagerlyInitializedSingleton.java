package com.coffeemachine.designpattern.singleton;

/**
 * Created by IntelliJ IDEA.
 * User: nasoloaina
 * Date: 8/31/11
 * Time: 8:54 PM
 * To change this template use File | Settings | File Templates.
 */
public class EagerlyInitializedSingleton {
    private static EagerlyInitializedSingleton instance = new EagerlyInitializedSingleton();

    private EagerlyInitializedSingleton() {
    }

    public static EagerlyInitializedSingleton getInstance() {
        return instance;
    }
}
