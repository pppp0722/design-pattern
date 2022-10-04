package com.pppp0722.designpattern.observer;

public class DetailDisplay implements Observer, DisplayElement {

    private WeatherData weatherData;
    private double temperature;
    private double humidity;
    private double pressure;

    public DetailDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update() {
        temperature = weatherData.getTemperature();
        humidity = weatherData.getHumidity();
        pressure = weatherData.getPressure();
        display();
    }

    @Override
    public void display() {
        System.out.println("온도 : " + temperature + "F, 습도 : " + humidity + "%, 기압 : " + pressure);
    }
}
