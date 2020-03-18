package com.example.designmodel.singleton;

import cn.hutool.core.util.ObjectUtil;

/**
 * 双check的线程安全单例模式
 *
 * @author michael
 * @Date Mar 10, 2020
 */
public class DuckSingletonDubboCheck {
    private static volatile DuckSingletonDubboCheck duckSingleton;  //volatile 添加是避免指令重排

    private DuckSingletonDubboCheck() {
    }

    public static DuckSingletonDubboCheck getDuckSingleton() {
        if (ObjectUtil.isEmpty(duckSingleton)) { //双check模式
            synchronized (DuckSingletonDubboCheck.class) {
                if (ObjectUtil.isEmpty(duckSingleton)) {
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    duckSingleton = new DuckSingletonDubboCheck();
                }
            }
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
                    System.out.println("HashCode:" + DuckSingletonDubboCheck.getDuckSingleton().hashCode());
                }
            }).start();
        }
    }
}
