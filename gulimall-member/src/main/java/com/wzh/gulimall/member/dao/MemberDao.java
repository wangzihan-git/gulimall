package com.wzh.gulimall.member.dao;

import com.wzh.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author wzh
 * @email 3471188738@qq.com
 * @date 2021-08-29 22:44:02
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
