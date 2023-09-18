package com.techreturners.encapsulation.bankaccount.test;

import com.techreturners.encapsulation.bankaccount.model.WeatherReporter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WeatherReporterTest {
    @Test
    public void checkWeatherReport() {
        WeatherReporter weatherReporter = new WeatherReporter("London", 20);
        assertEquals("I am in London and it is 🌦. Ahhh...it's just right 😊!. The temperature in Fahrenheit is 68.", weatherReporter.showWeatherReport());
    }

    @Test
    public void testGetTempInFahrenheit() {
        WeatherReporter weatherReporter = new WeatherReporter("London", 20);
        double tempInFahrenheit = weatherReporter.getTempInFahrenheit();
//        System.out.println(tempInFahrenheit);
        assertEquals(68.0, tempInFahrenheit);
    }

    @Test
    public void testGetCheckLocation() {
        WeatherReporter weatherReporter = new WeatherReporter("London", 20);
        String location = weatherReporter.getCheckLocation();
//        System.out.println(location);
        assertEquals("🌦", location);
    }

    @Test
    public void testGetCheckTemperature() {
        WeatherReporter weatherReporter = new WeatherReporter("London", 20);
        String temperature = weatherReporter.getCheckTemperature();
//        System.out.println(temperature);
        assertEquals("Ahhh...it's just right 😊!", temperature);
    }
}