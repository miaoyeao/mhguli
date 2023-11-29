package com.mh.guli.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mh.common.utils.PageUtils;
import com.mh.guli.coupon.entity.HomeAdvEntity;

import java.util.Map;

/**
 * 首页轮播广告
 *
 * @author mh
 * @email mh@gmail.com
 * @date 2023-11-23 22:33:40
 */
public interface HomeAdvService extends IService<HomeAdvEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

