package com.example.designmodel.command;

/**
 * @author xiongda
 * @ClassName PauseAction
 * @Description暂停播放播放实现类
 * @createTime 2022-03-31 13:44
 */
public class PauseAction implements IAction{

    private  GPlay gPlay;

    public PauseAction(GPlay gPlay){
        this.gPlay = gPlay;
    }

    @Override
    public void execute() {
        gPlay.pause();
    }

}
