package com.example.designmodel.factorymethod;
/**
 *@DATE Mar 15, 2020
 *@AUTHOR michael
 *@DESC  
 */
public class FactoryMain {

	public static void main(String[] args) {
		MoveTool tool = new Car();
		tool.go();
		
		Car car  =  new MoveFactory().createCar(); 
		car.go();
		
		
		Car car2  = new CarFactory().createCar();
		car2.go();
		
	}

}
