package com.example.designmodel.proxy.dynamic;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author xiongda
 * @ClassName CGlibMeiPo
 * @Description  利用cglib的动态代理模式实现-演示
 * @createTime 2022/3/10 14:05
 */
public class CGlibMeiPo implements MethodInterceptor {

    public Object getInstance(Class<?> clazz) throws Exception {
        Enhancer en = new Enhancer();
        en.setSuperclass(clazz);
        en.setCallback(this);
        return en.create();
    }

    private void  before(){
        System.out.println("我是媒婆,已经收集到你的需求!");
        System.out.println("开始物色您所需要的对象目标!");

    }

    private void after(){
        System.out.println("双方同意,开始接触交往");
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        this.before();
        Object object =methodProxy.invokeSuper(o,objects);
        this.after();
        return object;
    }

}
