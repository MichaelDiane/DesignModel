package com.example.designmodel.factorymethod;
/**
 *@DATE Mar 15, 2020
 *@AUTHOR michael
 *@DESC  定义交通工具工具类,这种方式为简单工厂类方式(扩展弱)
 */
public class MoveFactory {
		public Car createCar() {
			return new Car();
		}
}
