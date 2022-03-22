package com.example.designmodel.bridge;

/**
 * @author xiongda
 * @ClassName EmailMessage
 * @Description 邮箱发送
 * @createTime 2022-03-22 16:07
 */
public class EmailMessage implements IMessage {
    @Override
    public void send(String message, String toUser) {
        System.out.println("---send ------ email------");
    }
}
