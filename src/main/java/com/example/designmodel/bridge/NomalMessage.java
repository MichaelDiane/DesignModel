package com.example.designmodel.bridge;

/**
 * @author xiongda
 * @ClassName NomalMessage
 * @Description 普通消息处理对象
 * @createTime 2022-03-22 16:17
 */
public class NomalMessage extends AbstractMessage {

    public NomalMessage(IMessage message) {
        super(message);
    }

    @Override
    public  void  sendMessage(String message, String toUser){
        super.sendMessage(message, toUser);
    }

}
