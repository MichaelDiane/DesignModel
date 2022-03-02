package com.example.designmodel.factory.abstractfactory.one;
/**
 *@DATE Mar 15, 2020
 *@AUTHOR michael
 *@DESC  
 */
public class MainFactory {

	public static void main(String[] args) {
		AbstractFactory factory =  new FoodFactory();
		factory.createSoup().soupName();
	}

}
