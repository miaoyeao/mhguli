package com.mh.guli.order.dao;

import com.mh.guli.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author mh
 * @email mh@gmail.com
 * @date 2023-11-23 22:40:27
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
