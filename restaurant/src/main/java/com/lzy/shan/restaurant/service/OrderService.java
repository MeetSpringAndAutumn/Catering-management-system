package com.lzy.shan.restaurant.service;

import com.lzy.shan.restaurant.entity.CustomPageInfo;
import com.lzy.shan.restaurant.entity.Order;

/**
 * Created with IDEA
 * author:ShanZhengShuai
 * Date:2023/10/2
 * Time:15:02
 *
 * 订单管理业务逻辑
 */

public interface OrderService {
    /**
     * 添加订单
     * @param order
     */
    String addOrder(Order order);

    /**
     * 多条件分页查询订单
     * @param customPageInfo
     * @return
     */
    CustomPageInfo<Order> findPage(CustomPageInfo<Order> customPageInfo);

    /**
     * 根据订单id查询订单
     * @param orderId
     * @return
     */
    Order findById(Long orderId);

    /**
     * 根据订单id删除订单
     * @param strIds
     */
    void deleteByIds(String strIds);

    /**
     * 修改订单
     * @param order
     */
    void update(Order order);

    /**
     * 结账业务
     * @param order
     */
    void settleAccounts(Order order);
}
