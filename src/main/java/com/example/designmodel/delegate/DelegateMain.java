package com.example.designmodel.delegate;

/**
 * @author xiongda
 * @ClassName DelegateMain
 * @Description 行为型-委派摸式
 * @createTime 2022-03-24 9:37
 */
public class DelegateMain {
    public static void main(String[] args) {
        //构建委派对象,执行任务
        Delegate delegate =  new Delegate();
        delegate.doTask();
    }
}
