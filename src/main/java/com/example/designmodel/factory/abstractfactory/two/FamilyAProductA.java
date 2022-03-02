package com.example.designmodel.factory.abstractfactory.two;

/**
 * @author xiongda
 * @ClassName FamilyAProductA
 * @Description TODO
 * @createTime 2022/3/2 8:48
 */
public class FamilyAProductA implements IProductA{

    @Override
    public void doA() {
        System.out.println("The IProductA be part of FamilyA");
    }

}
