package com.example.designmodel.flyweight;

/**
 * @author xiongda
 * @ClassName IFlyWeight
 * @Description 结构设计模式-亨元模式
 * @createTime 2022/3/15 14:35
 */
public interface IFlyWeight {
    /**
     *
     * @param extrinsicState 外部状态
     */
    void operation(String extrinsicState);
}
