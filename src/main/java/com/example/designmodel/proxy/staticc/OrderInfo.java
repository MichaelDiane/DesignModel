package com.example.designmodel.proxy.staticc;

import lombok.Data;

/**
 * @author xiongda
 * @ClassName OrderInfo
 * @Description 静态代理-订单对象
 * @createTime 2022/3/10 11:27
 */
@Data
public class OrderInfo {
    private Object info;
    private Long createTime;
    private String id;
}
