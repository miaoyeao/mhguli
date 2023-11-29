package com.mh.guli.coupon.dao;

import com.mh.guli.coupon.entity.MemberPriceEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品会员价格
 * 
 * @author mh
 * @email mh@gmail.com
 * @date 2023-11-23 22:33:40
 */
@Mapper
public interface MemberPriceDao extends BaseMapper<MemberPriceEntity> {
	
}
