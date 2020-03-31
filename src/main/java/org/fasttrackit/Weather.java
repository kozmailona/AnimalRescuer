package org.fasttrackit;

public class Weather {

    String outsideTemperature;      //rainy, sunny, windy, foggy
    double temperatureInCelsius;        // 22.5°C

    public Weather(String outsideTemperature, double temperatureInCelsius) {
        this.outsideTemperature = outsideTemperature;
        this.temperatureInCelsius = temperatureInCelsius;
    }
}
