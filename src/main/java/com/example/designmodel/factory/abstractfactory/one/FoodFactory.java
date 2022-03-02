package com.example.designmodel.factory.abstractfactory.one;
/**
 *@DATE Mar 15, 2020
 *@AUTHOR michael
 *@DESC  
 */
public  class FoodFactory extends AbstractFactory{

	@Override
	AbstractFood createFood() {
		return new Dumping();
	}

	@Override
	AbstractSoup createSoup() {
		return new BeefSoup();
	}

}
