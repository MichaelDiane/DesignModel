package com.example.designmodel.proxy.dynamic;

import org.springframework.cglib.proxy.InvocationHandler;
import org.springframework.cglib.proxy.Proxy;

import java.lang.reflect.Method;

/**
 * @author xiongda
 * @ClassName JdkMeiPo
 * @Description 使用jdk中的动态代理实现对象代理对象
 * @createTime 2022/3/10 11:03
 */
public class JdkMeiPo  implements InvocationHandler {

    private IPerson person;

    public IPerson getInstance(IPerson person) {
        this.person = person;
        return (IPerson) Proxy.newProxyInstance(person.getClass().getClassLoader(), person.getClass().getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] objects) throws Throwable {
        this.before();
        Object restult = method.invoke(this.person, objects);
        after();
        return restult;
    }

    private void  before(){
        System.out.println("我是媒婆,已经收集到你的需求,开始物色您所需要的对象目标!");
    }

    private void after(){
        System.out.println("双方同意,开始接触交往");
    }

}
