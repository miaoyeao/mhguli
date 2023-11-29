package com.mh.guli.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mh.common.utils.PageUtils;
import com.mh.guli.member.entity.MemberStatisticsInfoEntity;

import java.util.Map;

/**
 * 会员统计信息
 *
 * @author mh
 * @email mh@gmail.com
 * @date 2023-11-23 22:38:34
 */
public interface MemberStatisticsInfoService extends IService<MemberStatisticsInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

