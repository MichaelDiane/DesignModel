package com.example.designmodel.proxy.normal;/**
 /**
 * @ClassName Proxy
 * @author xiongda
 * @Description 代理主题对象
 * @createTime 2022/3/10 10:46
 */
public class Proxy implements ISubject{
    private ISubject subject;

    public  Proxy(ISubject subject){
        this.subject = subject;
    }

    @Override
    public void request() {
        this.before();
        subject.request();
        this.after();
    }

   private void  before() {
        System.out.println("====proxy=======before====");
    }

    private void after() {
        System.out.println("====proxy=======after====");
    }
}
