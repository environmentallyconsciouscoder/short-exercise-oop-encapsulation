package com.techreturners.encapsulation.bankaccount.model;

import java.text.MessageFormat;
import java.util.Objects;

public class WeatherReporter {

    private final Location location;
    private final Temperature temperature;

    public WeatherReporter(String location, double temperature) {
        this.location = new Location(location);
        this.temperature = new Temperature(temperature);
    }

    public String showWeatherReport() {
        double newTemp = getNewTemp();
        return MessageFormat.format("I am in {0} and it is {1}. {2}. The temperature in Fahrenheit is {3}.", location.getLocation(), checkLocation(), checkTemperature(), newTemp);
    }

    public double getTempInFahrenheit() {
        return getNewTemp();
    }

    private double getNewTemp() {
        return (9.0 / 5.0) * temperature.getTemperature() + 32;
    }

    public String getCheckLocation() {
        return checkLocation();
    }

    private String checkLocation() {
        return switch (location.getLocation()) {
            case "London" -> WeatherConstants.LONDON_EMOJI;
            case "California" -> WeatherConstants.CALIFORNIA_EMOJI;
            case "Cape Town" -> WeatherConstants.CAPE_TOWN_EMOJI;
            default -> WeatherConstants.DEFAULT_WEATHER_EMOJI;
        };
    }

    public String getCheckTemperature() {
        return checkTemperature();
    }

    private String checkTemperature() {
        if (temperature.getTemperature() > 30) {
            return WeatherConstants.HOT_TEMPERATURE_MESSAGE;
        } else if (temperature.getTemperature() < 10) {
            return WeatherConstants.COLD_TEMPERATURE_MESSAGE;
        }
            return WeatherConstants.COMFORTABLE_TEMPERATURE_MESSAGE;
    }



}
