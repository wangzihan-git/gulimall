package com.wzh.gulimall.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wzh.common.utils.PageUtils;
import com.wzh.gulimall.entity.SkuInfoEntity;

import java.util.Map;

/**
 * sku信息
 *
 * @author wzh
 * @email 3471188738@qq.com
 * @date 2021-08-27 22:26:27
 */
public interface SkuInfoService extends IService<SkuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

