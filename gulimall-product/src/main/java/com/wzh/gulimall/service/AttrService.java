package com.wzh.gulimall.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wzh.common.utils.PageUtils;
import com.wzh.gulimall.entity.AttrEntity;

import java.util.Map;

/**
 * 商品属性
 *
 * @author wzh
 * @email 3471188738@qq.com
 * @date 2021-08-27 22:26:26
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

