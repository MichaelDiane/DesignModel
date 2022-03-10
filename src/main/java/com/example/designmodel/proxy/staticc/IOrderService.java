package com.example.designmodel.proxy.staticc;

/**
 * @author xiongda
 * @ClassName OrderService
 * @Description 静态代理-订单数据库切换数据源
 * @createTime 2022/3/10 11:26
 */
public interface IOrderService {
    /**
     * 创建订单信息
     * @param orderInfo 订单信息
     * @return
     */
    int createOrder(OrderInfo orderInfo);
}
