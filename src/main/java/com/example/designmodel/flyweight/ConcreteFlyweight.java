package com.example.designmodel.flyweight;

/**
 * @author xiongda
 * @ClassName ConcreteFlyweight
 * @Description 具体亨元角色实现
 * @createTime 2022/3/15 14:37
 */
public class ConcreteFlyweight implements IFlyWeight{
    //内部状态
    private String intrinsicState ;

    public ConcreteFlyweight(String intrinsicState) {
        this.intrinsicState = intrinsicState;
    }

    /**
     * @param extrinsicState 外部状态
     */
    @Override
    public void operation(String extrinsicState) {
        System.out.println("Object address:" + System.identityHashCode(this));
        System.out.println("intrinsicState:" + this.intrinsicState);
        System.out.println("extrinsicState:" + extrinsicState);
    }

}
