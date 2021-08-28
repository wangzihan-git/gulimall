package com.wzh.gulimall.dao;

import com.wzh.gulimall.entity.CommentReplayEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价回复关系
 * 
 * @author wzh
 * @email 3471188738@qq.com
 * @date 2021-08-27 22:26:27
 */
@Mapper
public interface CommentReplayDao extends BaseMapper<CommentReplayEntity> {
	
}
