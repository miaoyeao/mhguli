package com.mh.guli.order.dao;

import com.mh.guli.order.entity.RefundInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 退款信息
 * 
 * @author mh
 * @email mh@gmail.com
 * @date 2023-11-23 22:40:27
 */
@Mapper
public interface RefundInfoDao extends BaseMapper<RefundInfoEntity> {
	
}
