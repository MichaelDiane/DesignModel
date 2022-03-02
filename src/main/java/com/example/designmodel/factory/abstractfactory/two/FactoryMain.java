package com.example.designmodel.factory.abstractfactory.two;

/**
 * @author xiongda
 * @ClassName FactoryMain
 * @Description TODO
 * @createTime 2022/3/2 9:26
 */
public class FactoryMain {
    public static void main(String[] args) {
        IFactory factory = new FactoryA();
        factory.makeProductA().doA();
        factory.makeProductB().doB();

        factory =  new FactoryB();
        factory.makeProductB().doB();
        factory.makeProductA().doA();

    }
}
