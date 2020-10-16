package com.example.designmodel.observe;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author michael
 * @title: Weather
 * @projectName DesignModel
 * @description: 气温
 * @date 2020/10/16 15:15
 */
@Data
@AllArgsConstructor
public class Weather {
    private float temp;
    private float humidity;
    private float pressure;
}
