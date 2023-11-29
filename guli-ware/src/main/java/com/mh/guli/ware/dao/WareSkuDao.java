package com.mh.guli.ware.dao;

import com.mh.guli.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author mh
 * @email mh@gmail.com
 * @date 2023-11-23 22:45:58
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
