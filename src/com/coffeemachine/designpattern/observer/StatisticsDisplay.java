package com.coffeemachine.designpattern.observer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: nasoloaina
 * Date: 8/22/11
 * Time: 11:11 PM
 * To change this template use File | Settings | File Templates.
 */
public class StatisticsDisplay implements Observer, DisplayElement {
    private WeatherData weatherData;
    private List<Float> temperatures;
    private float average = 0f;
    private float maxTemperature = 0f;
    private float minTemperature = 0f;

    public StatisticsDisplay(WeatherData weatherData) {
        temperatures = new ArrayList<Float>();
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public float getAverage() {
        return average;
    }

    public void setAverage(float average) {
        this.average = average;
    }

    public float getMaxTemperature() {
        return maxTemperature;
    }

    public void setMaxTemperature(float maxTemperature) {
        this.maxTemperature = maxTemperature;
    }

    public float getMinTemperature() {
        return minTemperature;
    }

    public void setMinTemperature(float minTemperature) {
        this.minTemperature = minTemperature;
    }

    public void display() {
        System.out.println("Avg/Max/Min temperature : " + average + "/" + maxTemperature + "/" + minTemperature);
    }

    public void update(float temperature, float humidity, float pressure) {
        temperatures.add(temperature);
        setValues();
        display();
    }

    public void setValues() {
        float sum = 0f;
        for(float temperature : temperatures) {
            sum += temperature;
        }
        average = sum / temperatures.size();
        setAverage(average);

        Collections.sort(temperatures);
        maxTemperature = temperatures.get(temperatures.size() - 1);
        setMaxTemperature(maxTemperature);
        minTemperature = temperatures.get(0);
        setMinTemperature(minTemperature);
    }

}
