package com.example.designmodel.decorator;

/**
 * @author xiongda
 * @ClassName DecoratorMain
 * @Description 装饰器测试类
 * @createTime 2022/3/14 11:31
 */
public class DecoratorMain {
    public static void main(String[] args) {
        Component component = new ConcreteComponent();
        Decorator decoratorA = new ConcreteDecoratorA(component);
        decoratorA.operation();
        Decorator decoratorB = new ConcreteDecoratorB(component);
        decoratorB.operation();

        //装饰器可以装饰具体的装饰对象,此时相当于给对象在增加功能A的基础上再增加功能B
        Decorator decoratorBandB =  new ConcreteDecoratorA(decoratorB);
        decoratorBandB.operation();
    }
}
