package com.example.designmodel.factory.simple;

/**
 * @author xiongda
 * @ClassName JavaBook.java
 * @Description TODO
 * @createTime 2022年02月17日
 */
public class JavaBook implements IBooK {
    @Override
    public void makeBook() {
        System.out.println("create a java book!!");
    }
}
