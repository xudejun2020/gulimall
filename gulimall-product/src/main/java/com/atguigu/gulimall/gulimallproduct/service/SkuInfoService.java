package com.atguigu.gulimall.gulimallproduct.service;

import com.atguigu.gulimall.gulimallcommon.utils.PageUtils;
import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gulimall.gulimallproduct.entity.SkuInfoEntity;

import java.util.Map;

/**
 * sku信息
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2022-06-29 09:59:36
 */
public interface SkuInfoService extends IService<SkuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

