package com.example.designmodel.decorator;

/**
 * @author xiongda
 * @ClassName Decorate
 * @Description 装饰器
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
