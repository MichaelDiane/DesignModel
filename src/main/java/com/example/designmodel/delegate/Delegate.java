package com.example.designmodel.delegate;

import java.util.Random;

/**
 * @author xiongda
 * @ClassName Delegate
 * @Description 委派角色
 * @createTime 2022-03-24 9:33
 */
public class Delegate implements ITask {

    @Override
    public void doTask() {
        System.out.println(" Delegate Begin! ");
        ITask task  = null;
        if(new Random().nextBoolean() == Boolean.TRUE){
            task = new ConcreteA();
        }else{
            task = new ConcreteB();
        }
        task.doTask();
        System.out.println(" Delegate End! ");
    }

}
