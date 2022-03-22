package com.example.designmodel.bridge;

/**
 * @author xiongda
 * @ClassName AbstractMessage
 * @Description 桥接抽象
 * 优点:
 *  1.分离抽象部分以及具体实现部分
 *  2.提高了系统的扩展性
 *  3.服务开闭原则&复用原则
 * 缺点:
 *  1.增加了系统的理解与设计难度
 *  2.需要正确的识别系统中两个独立变化的纬度
 * @createTime 2022-03-22 16:11
 */
public  abstract  class AbstractMessage {
     IMessage iMessage;

     public AbstractMessage(IMessage message){
         this.iMessage = message;
     }

     public  void  sendMessage(String message, String toUser){
         this.iMessage.send(message,toUser);
     }

}
