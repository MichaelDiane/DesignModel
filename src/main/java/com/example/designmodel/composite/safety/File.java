package com.example.designmodel.composite.safety;

/**
 * @author xiongda
 * @ClassName File
 * @Description TODO
 * @createTime 2022/3/16 14:55
 */
public class File extends Directory{

    public  File(String name){
        super(name);
    }

    @Override
    public void show() {
        System.out.println(this.name);
    }
}
