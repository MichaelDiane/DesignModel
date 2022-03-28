package com.example.designmodel.template;

/**
 * @author xiongda
 * @ClassName TemplateClass
 * @Description 行为型设计模式- 模板模式
 * @createTime 2022-03-24 10:51
 */
public abstract class AbstractTemplate{
    protected void start(){
        System.out.println("AbstractTemplate:start");
    }
    protected void step(){
        System.out.println("AbstractTemplate:step");
    }

    protected void stop(){
        System.out.println("AbstractTemplate:stop");
    }

    public final void templateMethod(){
        this.start();
        this.step();
        this.stop();
    }
}
