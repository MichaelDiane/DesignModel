package com.example.designmodel.singleton;

/**
 * *饿汉单例模式
 *
 * @author michael
 * @Date Mar 10, 2020
 */
public class DuckSingleton {
    private static final DuckSingleton duckSingleton = new DuckSingleton();

    private DuckSingleton() {
    }

    public static DuckSingleton getDuckSingleton() {
        return duckSingleton;
    }

    public void swing() {
        System.out.println("我会游泳!!");
    }

    public static void main(String[] args) {
        DuckSingleton duckSingleton = DuckSingleton.getDuckSingleton();
        duckSingleton.swing();
    }
}
