package com.example.designmodel.command;

/**
 * @author xiongda
 * @ClassName SpeedAction
 * @Description 拖动播放实现类
 * @createTime 2022-03-31 13:44
 */
public class SpeedAction implements IAction{
    private  GPlay gPlay;

    public SpeedAction(GPlay gPlay){
        this.gPlay = gPlay;
    }

    @Override
    public void execute() {
        gPlay.speed();
    }

}
