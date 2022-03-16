package com.example.designmodel.composite.lucency;

import java.util.ArrayList;

/**
 * @author xiongda
 * @ClassName Composite
 * @Description 树枝节点
 * @createTime 2022/3/16 13:10
 */
public class Composite extends Component{

    private ArrayList<Component> components;

    public Composite(String name) {
        super(name);
        this.components = new ArrayList<Component>();
    }

    @Override
    public String operation() {
        StringBuilder builder = new StringBuilder(this.name);
        for (Component component:this.components){
            builder.append("\n");
            builder.append(component.operation());
        }
        return builder.toString();
    }

    @Override
    public boolean addChild(Component component){
        throw new UnsupportedOperationException(" addChild not supported! ");
    }

    @Override
    public  boolean removeChild(Component component){
        throw new UnsupportedOperationException(" removeChild not supported! ");
    }

    @Override
    public  Component getChild(int index){
        throw new UnsupportedOperationException(" getChild not supported! ");
    }

}
