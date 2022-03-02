package com.example.designmodel.factory.abstractfactory.two;

/**
 * @author xiongda
 * @ClassName FamilyAProductB
 * @Description TODO
 * @createTime 2022/3/2 8:48
 */
public class FamilyAProductB implements IProductB{

    @Override
    public void doB() {
        System.out.println("The IProductB be part of FamilyA");
    }

}
