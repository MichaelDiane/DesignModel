package com.example.designmodel.flyweight;

/**
 * @author xiongda
 * @ClassName FlyweightMain
 * @Description 亨元模式:
 * 优点:
 *  1.减少创建对象的创建,降低内存中对象的数量,降低系统的内存使用,提高效率
 *  2.减少内存之外的其他资源占用
 * 缺点:
 *  1.关注内,外部状态,关注线程安全问题
 *  2.使系统,程序的逻辑复杂化
 *
 * @createTime 2022/3/15 14:45
 */
public class FlyweightMain {
    public static void main(String[] args) {
        FlyweightFactory flyweightFactory = new FlyweightFactory();
        IFlyWeight flyweightA = flyweightFactory.getFlyWeight("aaa");
        IFlyWeight flyweightB = flyweightFactory.getFlyWeight("bbb");
        flyweightA.operation("a");
        flyweightB.operation("b");
    }
}
