package com.example.designmodel.chain;

/**
 * @author xiongda
 * @ClassName Handler
 * @Description 责任链模式-结构模型
 * @createTime 2022-03-28 14:24
 */
public abstract  class Handler {

    protected Handler handler;

    public void nextHandler(Handler handler) {
        this.handler = handler;
    }

    //下一步处理
    public abstract void doHandle(Member member);

}
