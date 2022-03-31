package com.example.designmodel.command;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xiongda
 * @ClassName CommandMain
 * @Description 命令模式
 * 优点:
 *   解耦命令请求与实现
 *   扩展性好,可以很容易添加新命令
 *   支持组合命令,支持命令队列
 *   结合装饰器模式会更加灵活
 * 缺点:
 *   类可能过多
 *   增加理解上的难度
 * @createTime 2022-03-31 13:53
 */
public class CommandMain {
    public static void main(String[] args) {

        List<IAction> actions =  new ArrayList<>();
        GPlay gply =  new GPlay();

        actions.add(new PlayAction(gply));
        actions.add(new SpeedAction(gply));
        actions.add(new PauseAction(gply));
        actions.add(new StopAction(gply));

        for (IAction action : actions) {
            action.execute();
        }
        actions.clear();
    }
}
