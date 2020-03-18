package com.example.designmodel.factory;
/**
 *@DATE Mar 15, 2020
 *@AUTHOR michael
 *@DESC  
 */
public  class FoodFactory extends AbstractFactory{

	@Override
	Food createFood() {
		return new Dumping();
	}

	@Override
	Soup createSoup() {
		return new BeefSoup();
	}

}
