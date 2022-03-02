package com.example.designmodel.factory.abstractfactory.two;

/**
 * @author xiongda
 * @ClassName FamilyBProductA
 * @Description TODO
 * @createTime 2022/3/2 8:48
 */
public class FamilyBProductA implements IProductA{

    @Override
    public void doA() {
        System.out.println("The IProductA be part of FamilyB");
    }

}
