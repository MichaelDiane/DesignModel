package com.example.designmodel.bridge;

/**
 * @author xiongda
 * @ClassName IMessage
 * @Description 结构类型-桥接模式
 * @createTime 2022-03-22 16:05
 */
public interface IMessage {
    void send(String message, String toUser);
}
