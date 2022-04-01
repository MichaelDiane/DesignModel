package com.example.designmodel.state.normal;

/**
 * @author xiongda
 * @ClassName StateMain
 * @Description 状态模式-行为型设计模式
 * 本质:
 *    1.通过状态的判断逻辑转移到表示不同状态的一些列类中,可以把复杂的逻辑判断简化.
 * 适用场景:
 *    1.行为随着状态改变而改变的场景
 *    2.一个操作中有庞大的多分支结构,并且这些分支取决于对象的状态
 * @createTime 2022-04-01 10:56
 */
public class StateMain {
    public static void main(String[] args) {
        AppContext context = new AppContext();
        context.favorite();
        context.comment("送餐太慢啦~");
    }
}
