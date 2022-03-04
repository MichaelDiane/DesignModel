package com.example.designmodel.singleton;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author xiongda
 * @ClassName ContainerSingleton
 * @Description 容器单例模式-线程非安全 | 适用大量创建单利对象场景,便于管理
 * @createTime 2022/3/4 16:04
 */
public class ContainerSingleton {
    private  static Map<String ,Object> iocMap = new ConcurrentHashMap<String,Object>();
    private ContainerSingleton() {}
    public static  Object getBean(String className) {
        synchronized(iocMap){
            if(!iocMap.containsKey(className)){
                Object obj = null;
                try {
                    obj = Class.forName(className).newInstance();
                    iocMap.put(className,obj);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                return obj;
            }else {
                return iocMap.get(className);
            }
        }
    }

}
