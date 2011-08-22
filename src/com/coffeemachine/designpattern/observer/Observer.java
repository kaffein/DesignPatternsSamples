package com.coffeemachine.designpattern.observer;

/**
 * Created by IntelliJ IDEA.
 * User: nasoloaina
 * Date: 8/22/11
 * Time: 10:43 PM
 * To change this template use File | Settings | File Templates.
 */
public interface Observer {
    public void update(float temperature, float humidity, float pressure);
}
