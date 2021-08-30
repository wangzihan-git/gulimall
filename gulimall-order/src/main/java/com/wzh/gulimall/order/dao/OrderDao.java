package com.wzh.gulimall.order.dao;

import com.wzh.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author wzh
 * @email 3471188738@qq.com
 * @date 2021-08-29 23:05:01
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
