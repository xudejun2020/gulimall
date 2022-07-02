package com.atguigu.gulimall.coupon.gulimallcoupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gulimall.gulimallcommon.utils.PageUtils;
import com.atguigu.gulimall.coupon.gulimallcoupon.entity.SeckillSessionEntity;

import java.util.Map;

/**
 * 秒杀活动场次
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2022-06-29 17:03:46
 */
public interface SeckillSessionService extends IService<SeckillSessionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

