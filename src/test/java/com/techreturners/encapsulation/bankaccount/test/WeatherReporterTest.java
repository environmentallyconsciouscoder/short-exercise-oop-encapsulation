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
}