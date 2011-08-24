package com.coffeemachine.designpattern.observer.builtin;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by IntelliJ IDEA.
 * User: nasoloaina
 * Date: 8/24/11
 * Time: 11:31 PM
 * To change this template use File | Settings | File Templates.
 */
public class CurrentConditionDisplay implements Observer, DisplayElement {
    private Observable observable;
    private float temperature;
    private float humidity;
    private float pressure;

    public CurrentConditionDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    public void update(Observable observable, Object o) {
        if(observable instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) observable;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            this.pressure = weatherData.getPressure();
            display();
        }
    }

    public void display() {
        System.out.println("Current conditions : " + temperature + "F degrees, and " + humidity + "% humidity");
    }

}