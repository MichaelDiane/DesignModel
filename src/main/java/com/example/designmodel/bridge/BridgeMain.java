package com.example.designmodel.bridge;

/**
 * @author xiongda
 * @ClassName BridgeMain
 * @Description 桥接模式测试类
 * @createTime 2022-03-22 16:23
 */
public class BridgeMain {
    public static void main(String[] args) {
        IMessage imMessage =  new SmsMessage();
        AbstractMessage abstractMessage = new NomalMessage(imMessage);
        abstractMessage.sendMessage("请教保险申请","张总");

        imMessage =  new EmailMessage();
        abstractMessage =  new UrgencyMessage(imMessage);
        abstractMessage.sendMessage("嘉宾邀请","陈总");

    }
}
