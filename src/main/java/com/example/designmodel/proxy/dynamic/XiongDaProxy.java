package com.example.designmodel.proxy.dynamic;

/**
 * @author xiongda
 * @ClassName XiongDaProxy
 * @Description TODO
 * @createTime 2022/3/10 11:11
 */
public class XiongDaProxy implements IPerson{
    /**
     * 介绍相亲
     */
    @Override
    public void findLove() {
        System.out.println("熊大的要求很符合!!");
    }

}
