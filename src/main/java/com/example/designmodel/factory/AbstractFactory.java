package com.example.designmodel.factory;
/**
 *@DATE Mar 15, 2020
 *@AUTHOR michael
 *@DESC  抽象工厂实现一族群工厂实现
 */
public abstract class AbstractFactory {
	abstract Food createFood();
	abstract Soup createSoup();
}
