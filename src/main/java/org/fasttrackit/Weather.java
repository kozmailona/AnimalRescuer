package org.fasttrackit;

public class Weather {

    private String outsideTemperature;      //rainy, sunny, windy, foggy
    private double temperatureInCelsius;        // 22.5°C

    public Weather(String outsideTemperature, double temperatureInCelsius) {
        this.outsideTemperature = outsideTemperature;
        this.temperatureInCelsius = temperatureInCelsius;
    }

    public String getOutsideTemperature() {
        return outsideTemperature;
    }

    public void setOutsideTemperature(String outsideTemperature) {
        this.outsideTemperature = outsideTemperature;
    }

    public double getTemperatureInCelsius() {
        return temperatureInCelsius;
    }

    public void setTemperatureInCelsius(double temperatureInCelsius) {
        this.temperatureInCelsius = temperatureInCelsius;
    }
}
