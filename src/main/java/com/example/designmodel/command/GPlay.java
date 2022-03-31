package com.example.designmodel.command;

/**
 * @author xiongda
 * @ClassName GPlay
 * @Description 播放器实体类
 * @createTime 2022-03-31 13:39
 */
public class GPlay {

    public void  play(){
        System.out.println("正常播放!");
    }

    public void  speed(){
        System.out.println("拖动进度条!");
    }

    public void  stop(){
        System.out.println("停止播放!");
    }

    public void  pause(){
        System.out.println("暂停播放!");
    }

}
