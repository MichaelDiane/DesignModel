package com.example.designmodel.observe;

/**
 * @author michael
 * @title: ObserveMain
 * @projectName DesignModel
 * @description: TODO
 * @date 2020/10/16 15:43
 */
public class ObserveMain {
    public static void main(String[] args) {
        Weather weather =  new Weather(19.9f,87.6f,100f);
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay display =  new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurements(weather);
    }
}
