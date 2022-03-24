package com.example.designmodel.delegate;

/**
 * @author xiongda
 * @ClassName ConcreteB
 * @Description 具体任务B
 * @createTime 2022-03-24 9:32
 */
public class ConcreteB implements ITask {
    @Override
    public void doTask() {
        System.out.println(" Exec B Task!");
    }
}
