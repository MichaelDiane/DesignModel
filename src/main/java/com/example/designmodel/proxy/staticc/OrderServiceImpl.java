package com.example.designmodel.proxy.staticc;

import org.springframework.stereotype.Service;

/**
 * @author xiongda
 * @ClassName OrderInfoService
 * @Description TODO
 * @createTime 2022/3/10 11:29
 */
@Service
public class OrderServiceImpl implements IOrderService{

    private  OrderInfoDao orderInfoDao;

    /**
     * 创建订单信息
     *
     * @param orderInfo 订单信息
     * @return
     */
    @Override
    public int createOrder(OrderInfo orderInfo) {
        return orderInfoDao.save(orderInfo);
    }
}
