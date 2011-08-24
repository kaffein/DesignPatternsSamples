package com.coffeemachine.designpattern.observer.builtin;

/**
 * Created by IntelliJ IDEA.
 * User: nasoloaina
 * Date: 8/22/11
 * Time: 11:37 PM
 * To change this template use File | Settings | File Templates.
 */
public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);

    }
}
