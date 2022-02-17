package com.example.designmodel.factory.simple;

/**
 * @author xiongda
 * @ClassName GoBook.java
 * @Description TODO
 * @createTime 2022年02月17日
 */
public class GoBook implements IBooK {
    @Override
    public void makeBook() {
        System.out.println("create a go book!!");
    }
}
