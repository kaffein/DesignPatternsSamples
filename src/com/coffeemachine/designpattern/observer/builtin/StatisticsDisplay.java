package com.coffeemachine.designpattern.observer.builtin;

import com.coffeemachine.designpattern.utils.StatisticsUtil;

import java.util.*;

/**
 * Created by IntelliJ IDEA.
 * User: nasoloaina
 * Date: 8/25/11
 * Time: 10:09 PM
 * To change this template use File | Settings | File Templates.
 */
public class StatisticsDisplay implements Observer, DisplayElement {
    private List<Float> temperatures;
    private float averageTemperature;
    private float minTemperature;
    private float maxTemperature;
    WeatherData weatherData;

    public StatisticsDisplay(WeatherData weatherData) {
        temperatures = new ArrayList<Float>();
        this.weatherData = weatherData;
        weatherData.addObserver(this);
    }

    public void update(Observable observable, Object o) {
        if(observable instanceof WeatherData) {
            temperatures.add(weatherData.getTemperature());
            averageTemperature = StatisticsUtil.getAverage(temperatures);
            Collections.sort(temperatures);
            minTemperature = temperatures.get(0);
            maxTemperature = temperatures.get(temperatures.size() - 1);
            display();
        }
    }

    public void display() {
        System.out.println("Avg/Min/Max temperature = " + averageTemperature + "/" + minTemperature + "/" + maxTemperature);
    }

}
