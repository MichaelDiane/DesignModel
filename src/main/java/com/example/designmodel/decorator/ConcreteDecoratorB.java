package com.example.designmodel.decorator;

/**
 * @author xiongda
 * @ClassName ConcreteDecoratorB
 * @Description 装饰器具体实现装饰器B
 * @createTime 2022/3/14 11:22
 */
public class ConcreteDecoratorB extends Decorator{

    public ConcreteDecoratorB(Component component) {
        super(component);
    }

    //调用父类方法之前调用的方法
    private void operationBefore(){
        System.out.println("====ConcreteDecoratorB====operationBefore====");
    }

    //调用父类方法之后调用的方法
    private  void operationAfter(){
        System.out.println("====ConcreteDecoratorB====operationAfter====");
    }

    @Override
    public void operation(){
        this.operationBefore();
        super.operation();
        this.operationAfter();
    }

}
