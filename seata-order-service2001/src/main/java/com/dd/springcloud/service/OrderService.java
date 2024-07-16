package com.dd.springcloud.service;

import com.dd.springcloud.entities.Order;

public interface OrderService {
    /**
     * 创建订单
     */
    void create(Order order);
}
