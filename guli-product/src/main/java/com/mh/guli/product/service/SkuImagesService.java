package com.mh.guli.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mh.common.utils.PageUtils;
import com.mh.guli.product.entity.SkuImagesEntity;

import java.util.Map;

/**
 * sku图片
 *
 * @author mh
 * @email mh@gmail.com
 * @date 2023-11-19 13:02:32
 */
public interface SkuImagesService extends IService<SkuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

