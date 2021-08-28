package com.wzh.gulimall.dao;

import com.wzh.gulimall.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author wzh
 * @email 3471188738@qq.com
 * @date 2021-08-27 22:26:27
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
