package com.example.designmodel.composite.lucency;

/**
 * @author xiongda
 * @ClassName Component
 * @Description 结构设计模式-组合模式
 * @createTime 2022/3/16 13:04
 */
public abstract class Component {

    protected String name;

    public Component(String name){
        this.name = name;
    }

    public abstract String operation();

    public boolean addChild(Component component){
        throw new UnsupportedOperationException(" addChild not supported! ");
    }

    public  boolean removeChild(Component component){
        throw new UnsupportedOperationException(" removeChild not supported! ");
    }

    public  Component getChild(int index){
        throw new UnsupportedOperationException(" getChild not supported! ");
    }


}
