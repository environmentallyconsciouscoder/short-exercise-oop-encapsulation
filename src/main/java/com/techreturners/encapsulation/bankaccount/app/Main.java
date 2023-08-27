package com.techreturners.encapsulation.bankaccount.app;

    //import com.techreturners.encapsulation.bankaccount.model.DodgyBankAccount;
    //import com.techreturners.encapsulation.bankaccount.model.SecureBankAccount;
import com.techreturners.encapsulation.bankaccount.model.WeatherReporter;

public class Main {

    public static void main(String[] args) {

        WeatherReporter weatherReporter = new WeatherReporter("London", 20);
        System.out.println(weatherReporter.showWeatherReport());

    }

}
