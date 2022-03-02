package com.example.designmodel.factory.abstractfactory.two;

/**
 * @author xiongda
 * @ClassName FactoryB
 * @Description TODO
 * @createTime 2022/3/2 9:24
 */
public class FactoryB implements IFactory{
    @Override
    public IProductB makeProductB() {
        return new FamilyBProductB();
    }

    @Override
    public IProductA makeProductA() {
        return new FamilyBProductA();
    }
}
