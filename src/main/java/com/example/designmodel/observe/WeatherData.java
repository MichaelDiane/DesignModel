package com.example.designmodel.observe;

import java.util.ArrayList;

import lombok.AllArgsConstructor;

/**
 * @author michael
 * @title: WeatherData
 * @projectName DesignModel
 * @description: TODO
 * @date 2020/10/16 15:21
 */
public class WeatherData  implements  Subject {
    private ArrayList<Observe> observes;
    private Weather weather;

    public WeatherData(){
        observes =  new ArrayList<>();
    }

    @Override
    public void registerObserver(Observe observe) {
        observes.add(observe);
    }

    @Override
    public void removeObserver(Observe observe) {
        int index = observes.indexOf(observe);
        if(index>0){
            observes.remove(observe);
        }
    }

    @Override
    public void notifyObserver() {
        observes.forEach(item->{
            item.update(weather);
        });
    }

    public  void setMeasurements(Weather weather){
        this.weather =  weather;
        this.notifyObserver();
    }

}
