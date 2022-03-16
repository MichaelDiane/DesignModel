package com.example.designmodel.composite.safety;

/**
 * @author xiongda
 * @ClassName Directory
 * @Description 结构型-安全组合模式
 * @createTime 2022/3/16 14:54
 */
public  abstract class  Directory {

    protected String name;

    public Directory(String name) {
        this.name = name;
    }

    public abstract void show();
}
