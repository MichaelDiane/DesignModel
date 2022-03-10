package com.example.designmodel.proxy.normal;/**

 /**
 * @ClassName RealSubject
 * @author xiongda
 * @Description 真实主题对象
 * @createTime 2022/3/10 10:36
 */
public class RealSubject implements ISubject{
    @Override
    public void request() {
        System.out.println("real-subject");
    }
}
