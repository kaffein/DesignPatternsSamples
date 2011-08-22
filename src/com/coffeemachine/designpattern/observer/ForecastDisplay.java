package com.coffeemachine.designpattern.observer;

/**
 * Created by IntelliJ IDEA.
 * User: nasoloaina
 * Date: 8/22/11
 * Time: 11:34 PM
 * To change this template use File | Settings | File Templates.
 */
public class ForecastDisplay implements Observer, DisplayElement {
    private WeatherData weatherData;
    private String forecast;

    public ForecastDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public String getForecast() {
        return forecast;
    }

    public void setForecast(String forecast) {
        this.forecast = forecast;
    }

    public void display() {
        System.out.println("Forecast : " + forecast);
    }

    public void update(float temperature, float humidity, float pressure) {
        display();
    }
}
