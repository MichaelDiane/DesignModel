package com.example.designmodel.factory.simple;

/**
 * @author xiongda
 * @ClassName SimpleClient.java
 * @Description TODO
 * @createTime 2022年02月17日
 */
public class SimpleClient {
    public  static  void main(String[] args){
        SimpleFactory.bookName(GoBook.class).makeBook();
    }
}
