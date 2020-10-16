
package com.example.designmodel.observe.internal;

import com.example.designmodel.observe.Weather;

import java.util.Observable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * @author michael
 * @title: WeatherData
 * @projectName DesignModel
 * @description: 使用java内置的观察值模实现demo
 * @date 2020/10/16 15:21
 */
@Slf4j
@Data
@NoArgsConstructor
@AllArgsConstructor
public class JWeatherData extends Observable {

    private Weather weather;

    public void measurementChanged(){
        setChanged();
        notifyObservers();
    }

    public  void setMeasurement(Weather weather){
        this.weather = weather;
        this.measurementChanged();
    }



}
