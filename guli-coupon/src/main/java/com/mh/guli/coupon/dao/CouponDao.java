package com.mh.guli.coupon.dao;

import com.mh.guli.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author mh
 * @email mh@gmail.com
 * @date 2023-11-23 22:33:40
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
