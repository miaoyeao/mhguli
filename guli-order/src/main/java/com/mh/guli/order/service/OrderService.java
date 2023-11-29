package com.mh.guli.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mh.common.utils.PageUtils;
import com.mh.guli.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author mh
 * @email mh@gmail.com
 * @date 2023-11-23 22:40:27
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

