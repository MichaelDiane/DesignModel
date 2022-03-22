package com.example.designmodel.bridge;

/**
 * @author xiongda
 * @ClassName UrgencyMessage
 * @Description 加急消息处理
 * @createTime 2022-03-22 16:21
 */
public class UrgencyMessage extends AbstractMessage {
    public UrgencyMessage(IMessage message) {
        super(message);
    }

    @Override
    public  void  sendMessage(String message, String toUser){
        message = "加急==>" + message ;
        super.sendMessage(message, toUser);
    }

}
