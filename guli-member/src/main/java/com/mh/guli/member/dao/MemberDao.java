package com.mh.guli.member.dao;

import com.mh.guli.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author mh
 * @email mh@gmail.com
 * @date 2023-11-23 22:38:34
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
