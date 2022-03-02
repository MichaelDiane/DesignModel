package com.example.designmodel.factory.abstractfactory.two;

/**
 * @author xiongda
 * @ClassName FactoryA
 * @Description TODO
 * @createTime 2022/3/2 9:23
 */
public class FactoryA implements IFactory{
    @Override
    public IProductB makeProductB() {
        return new FamilyAProductB();
    }

    @Override
    public IProductA makeProductA() {
        return new FamilyAProductA();
    }
}
