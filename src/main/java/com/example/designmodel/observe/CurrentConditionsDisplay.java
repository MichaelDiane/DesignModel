package com.example.designmodel.observe;

import lombok.extern.slf4j.Slf4j;

/**
 * @author michael
 * @title: CurrentConditionsDisplay
 * @projectName DesignModel
 * @description: 展示布告
 * @date 2020/10/16 15:34
 */
@Slf4j
public class CurrentConditionsDisplay implements Observe,DisplayElement {

    private Weather weather;

    private Subject weatherData;

    public CurrentConditionsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void CurrentConditionsDisplay(Subject weatherData){

    }

    @Override
    public void display() {
       log.info("当前温度{},气压{}",weather.getTemp(),weather.getPressure());
    }

    @Override
    public void update(Weather weather) {
        this.weather = weather;
        this.display();
    }
}
