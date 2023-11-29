package com.mh.guli.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mh.common.utils.PageUtils;
import com.mh.guli.ware.entity.WareSkuEntity;

import java.util.Map;

/**
 * 商品库存
 *
 * @author mh
 * @email mh@gmail.com
 * @date 2023-11-23 22:45:58
 */
public interface WareSkuService extends IService<WareSkuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

