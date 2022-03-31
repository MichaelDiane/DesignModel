package com.example.designmodel.command;

/**
 * @author xiongda
 * @ClassName PlayAction
 * @Description 正常播放
 * @createTime 2022-03-31 13:43
 */
public class PlayAction implements IAction {
    private  GPlay gPlay;

    public PlayAction(GPlay gPlay){
        this.gPlay = gPlay;
    }

    @Override
    public void execute() {
        gPlay.play();
    }
}
