package com.example.designmodel.bridge;

/**
 * @author xiongda
 * @ClassName SmsMessage
 * @Description 短信发送
 * @createTime 2022-03-22 16:09
 */
public class SmsMessage implements IMessage{
    @Override
    public void send(String message, String toUser) {
        System.out.println("---send ---- sms----");
    }
}
