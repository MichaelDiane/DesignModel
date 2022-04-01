package com.example.designmodel.state.spring;

import lombok.Data;

/**
 * @author xiongda
 * @ClassName Order
 * @Description 订单实体类
 * @createTime 2022-04-01 13:12
 */
@Data
public class Order {
    private int id;
    private OrderStatus status;
}
