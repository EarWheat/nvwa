package com.nvwa.remote.remote;

import com.nvwa.remote.response.OrderInfo;
import com.nvwa.remote.service.OrderService;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ：liuzhaolu
 * @description：订单模块
 * @prd :
 * @date ：2022/1/17 8:01 下午
 * @Modification Date         Author          Description
 * ------------------------------------------ *
 * 2022/1/17 8:01 下午     liuzhaolu       firstVersion
 */
//@Component
//@ServiceProvider(serviceInterface = OrderService.class)
//public class OrderRemote implements OrderService {
//    @Override
//    public OrderInfo updateOrderInfo(OrderInfo orderInfo) {
//        orderInfo.setStatus(101);
//        return orderInfo;
//    }
//
//    @Override
//    public OrderInfo getOrderInfo(String orderId) {
//        OrderInfo.Item item = new OrderInfo.Item();
//        item.setName("iphone");
//        item.setPrice(6888.00);
//        List<OrderInfo.Item> items = new ArrayList<>();
//        items.add(item);
//        return OrderInfo.builder()
//                .userId(123L)
//                .status(1)
//                .userName("张三")
//                .items(items)
//                .build();
//    }
//}
