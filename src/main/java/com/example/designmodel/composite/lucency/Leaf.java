package com.example.designmodel.composite.lucency;

/**
 * @author xiongda
 * @ClassName Leaf
 * @Description TODO
 * @createTime 2022/3/16 13:26
 */
public class Leaf extends Component {

    public Leaf(String name){
        super(name);
    }

    @Override
    public String operation() {
        return this.name;
    }
}
