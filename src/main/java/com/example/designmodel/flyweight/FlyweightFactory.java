package com.example.designmodel.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @author xiongda
 * @ClassName FlyweightFactory
 * @Description 亨元工厂类
 * @createTime 2022/3/15 14:42
 */
public class FlyweightFactory {

    /**
     *   缓存对象
     */

    private static Map<String, IFlyWeight> pool = new HashMap<String, IFlyWeight>();

    /**
     * 获取亨元对象
     * @param intrinsicState
     * @return
     */
    public  IFlyWeight getFlyWeight(String intrinsicState){

        if(!pool.containsKey(intrinsicState)){

            IFlyWeight flyWeight = new ConcreteFlyweight(intrinsicState);

            pool.put(intrinsicState, flyWeight);

        }

        return pool.get(intrinsicState);
    }

}
