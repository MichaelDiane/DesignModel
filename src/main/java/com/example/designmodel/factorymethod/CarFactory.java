package com.example.designmodel.factorymethod;
/**
 *@DATE Mar 15, 2020
 *@AUTHOR michael
 *@DESC  针对每一个类型写一个Factory
 */
public class CarFactory {
	public Car createCar() {
		return new Car();
	}
}
