package com.mh.guli.product.dao;

import com.mh.guli.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author mh
 * @email mh@gmail.com
 * @date 2023-11-19 13:02:32
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
