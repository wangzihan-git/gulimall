package com.wzh.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wzh.common.utils.PageUtils;
import com.wzh.gulimall.ware.entity.WareInfoEntity;

import java.util.Map;

/**
 * 仓库信息
 *
 * @author wzh
 * @email 3471188738@qq.com
 * @date 2021-08-29 23:27:54
 */
public interface WareInfoService extends IService<WareInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

