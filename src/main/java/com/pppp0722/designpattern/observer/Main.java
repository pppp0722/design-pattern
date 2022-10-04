package com.pppp0722.designpattern.observer;

public class Main {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        DailyDisplay dailyDisplay = new DailyDisplay(weatherData);
        weatherData.setMeasurements(80.0d, 65.0d, 1020.8d);
        weatherData.removeObserver(dailyDisplay);
        weatherData.setMeasurements(79.0d, 64.0d, 1019.8d);

        DetailDisplay detailDisplay = new DetailDisplay(weatherData);
        weatherData.setMeasurements(78.0d, 63.0d, 1018.8d);
    }
}
