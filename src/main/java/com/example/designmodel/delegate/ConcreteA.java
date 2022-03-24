package com.example.designmodel.delegate;

/**
 * @author xiongda
 * @ClassName ConcrteA
 * @Description 具体任务A
 * @createTime 2022-03-24 9:29
 */
public class ConcreteA implements ITask {
    @Override
    public void doTask() {
        System.out.println(" Exec A Task!");
    }
}
