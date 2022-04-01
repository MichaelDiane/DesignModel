package com.example.designmodel.state.spring;

/**
 * @author xiongda
 * @ClassName OrderStatus
 * @Description 订单状态枚举类
 * @createTime 2022-04-01 13:12
 */
public enum OrderStatus {
    WAIT_PAYMENT, WAIT_DELIVER, WAIT_RECEIVE, FINISH;
}
