package com.example.designmodel.singleton;

/**
 * 枚举单例模式解决了线程同步，防止了反序列化(无构造器)
 *
 * @author michael
 * @Date Mar 10, 2020
 */
public enum EnumSingleton {
    DUCK_SINGLETON;

    public void duck_singleton() {
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println("HashCode:" + EnumSingleton.DUCK_SINGLETON.hashCode());
                }
            }).start();
        }
    }
}
