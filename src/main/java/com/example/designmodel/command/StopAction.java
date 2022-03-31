package com.example.designmodel.command;

/**
 * @author xiongda
 * @ClassName SpeedAction
 * @Description 停止播放播放实现类
 * @createTime 2022-03-31 13:44
 */
public class StopAction implements IAction{

    private  GPlay gPlay;

    public StopAction(GPlay gPlay){
        this.gPlay = gPlay;
    }

    @Override
    public void execute() {
        gPlay.stop();
    }

}
