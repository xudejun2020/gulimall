package com.atguigu.gulimall.gulimallproduct.service;

import com.atguigu.gulimall.gulimallcommon.utils.PageUtils;
import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gulimall.gulimallproduct.entity.SpuInfoDescEntity;

import java.util.Map;

/**
 * spu信息介绍
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2022-06-29 09:59:36
 */
public interface SpuInfoDescService extends IService<SpuInfoDescEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

