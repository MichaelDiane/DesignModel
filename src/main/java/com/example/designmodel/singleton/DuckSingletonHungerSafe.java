package com.example.designmodel.singleton;

import cn.hutool.core.util.ObjectUtil;

/**
 * 懒汉模式单例
 *
 * @author michael
 * @Date Mar 10, 2020
 */
public class DuckSingletonHungerSafe {

    private static DuckSingletonHungerSafe duckSingleton = null;

    private DuckSingletonHungerSafe() {
    }

    public static synchronized DuckSingletonHungerSafe getDuckSingleton() {
        if (ObjectUtil.isEmpty(duckSingleton)) { //存在线程安全问题解决，但性能低
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            duckSingleton = new DuckSingletonHungerSafe();
        }
        return duckSingleton;
    }

    public void swing() {
        System.out.println("我会游泳!!");
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println("HashCode:" + DuckSingletonHungerSafe.getDuckSingleton().hashCode());
                }
            }).start();
        }
    }
}
