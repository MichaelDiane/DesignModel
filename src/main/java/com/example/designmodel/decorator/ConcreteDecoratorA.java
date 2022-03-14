package com.example.designmodel.decorator;

/**
 * @author xiongda
 * @ClassName ConcreteDecoratorA
 * @Description 装饰器具体实现装饰器A
 * @createTime 2022/3/14 11:22
 */
public class ConcreteDecoratorA extends Decorator{

    public ConcreteDecoratorA(Component component) {
        super(component);
    }

    //调用父类方法之前调用的方法
    private void operationBefore(){
        System.out.println("====ConcreteDecoratorA====operationBefore====");
    }

    //调用父类方法之后调用的方法
    private  void operationAfter(){
        System.out.println("====ConcreteDecoratorA====operationAfter====");
    }

    @Override
    public void operation(){
        this.operationBefore();
        super.operation();
        this.operationAfter();
    }

}
