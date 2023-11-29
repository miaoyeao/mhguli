package com.mh.guli.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mh.common.utils.PageUtils;
import com.mh.guli.ware.entity.PurchaseDetailEntity;

import java.util.Map;

/**
 * 
 *
 * @author mh
 * @email mh@gmail.com
 * @date 2023-11-23 22:45:58
 */
public interface PurchaseDetailService extends IService<PurchaseDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

