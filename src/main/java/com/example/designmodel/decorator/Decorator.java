package com.example.designmodel.decorator;

/**
 * @author xiongda
 * @ClassName Decorate
 * @Description 装饰器
 * 优点:
 *  1.装饰器是继承有力的补充,比继承灵活,在不改变原有对象的情况下,动态地给一个对象扩展功能,即插即用
 *  2.通过使用不同装饰类及这些装饰类的排列组合,可以实现不同效果
 *  3.装饰器模式遵循开闭原则
 *
 * 缺点:
 *  1.会出现更多的代码,更多的类,增加程序的复杂性
 *  2.动态装饰在多层装饰时会更复杂
 *
 * @createTime 2022/3/14 11:19
 */
public abstract class Decorator extends  Component {

    protected Component component;

    public Decorator(Component component){
        this.component = component;
    }

    @Override
    public  void  operation(){
        component.operation();
    }

}
