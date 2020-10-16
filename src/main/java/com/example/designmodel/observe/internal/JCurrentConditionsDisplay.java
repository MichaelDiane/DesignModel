package com.example.designmodel.observe.internal;

import com.example.designmodel.observe.DisplayElement;
import com.example.designmodel.observe.Weather;

import java.util.Observable;
import java.util.Observer;

import lombok.extern.slf4j.Slf4j;

/**
 * @author michael
 * @title: CurrentConditionsDisplay
 * @projectName DesignModel
 * @description: 展示布告
 * @date 2020/10/16 15:34
 */
@Slf4j
public class JCurrentConditionsDisplay implements Observer, DisplayElement {
    private Weather  weather;

    private Observable observable;

    public  JCurrentConditionsDisplay(Observable o){
        this.observable=o;
        observable.addObserver(this);
    }

    @Override
    public void display() {
        log.info("当前温度{},气压{}",weather.getTemp(),weather.getPressure());
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof  JWeatherData){
            JWeatherData jWeatherData = (JWeatherData) o;
            this.weather = jWeatherData.getWeather();
            display();
        }
    }
}
