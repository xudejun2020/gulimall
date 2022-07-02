package com.atguigu.gulimall.coupon.gulimallcoupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gulimall.gulimallcommon.utils.PageUtils;
import com.atguigu.gulimall.coupon.gulimallcoupon.entity.SeckillSkuRelationEntity;

import java.util.Map;

/**
 * 秒杀活动商品关联
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2022-06-29 17:03:46
 */
public interface SeckillSkuRelationService extends IService<SeckillSkuRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

