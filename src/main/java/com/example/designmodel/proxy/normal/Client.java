package com.example.designmodel.proxy.normal;

 /**
 * @ClassName Client
 * @author xiongda
 * @Description 代理模式--客户端调用
 * @createTime 2022/3/10 10:52
 */
public class Client {
    public static void main(String[] args) {
        Proxy proxy = new Proxy(new RealSubject());
        proxy.request();
    }
}
