package com.example.designmodel.observe.internal;

import com.example.designmodel.observe.Weather;

/**
 * @author michael
 * @title: JObserveMain
 * @projectName DesignModel
 * @description: java内置策略模式
 * @date 2020/10/16 17:45
 */
public class JObserveMain {
    public static void main(String[] args) {
        Weather weather =  new Weather(19.9f,87.6f,100f);
        JWeatherData weatherData = new JWeatherData();
        weatherData.setWeather(weather);
        JCurrentConditionsDisplay display =  new JCurrentConditionsDisplay(weatherData);
        weatherData.measurementChanged();
    }
}
