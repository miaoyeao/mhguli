package com.mh.guli.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mh.common.utils.PageUtils;
import com.mh.guli.ware.entity.PurchaseEntity;

import java.util.Map;

/**
 * 采购信息
 *
 * @author mh
 * @email mh@gmail.com
 * @date 2023-11-23 22:45:58
 */
public interface PurchaseService extends IService<PurchaseEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

