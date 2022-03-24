package com.example.designmodel.delegate;

/**
 * @author xiongda
 * @ClassName DelegateMain
 * @Description 行为型-委派摸式
 * 优点:
 *  1.通过委派能够将大型服务任务细化,然后通过统一管理这些子任务完成的情况实现任务的跟进,加快执行效率
 * 缺点:
 *  1.委派模式可能随着浮复杂度的变换而变的更复杂,可能需要多从委派找出混乱.
 * @createTime 2022-03-24 9:37
 */
public class DelegateMain {
    public static void main(String[] args) {
        //构建委派对象,执行任务
        Delegate delegate =  new Delegate();
        delegate.doTask();
    }
}
