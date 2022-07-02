package com.atguigu.gulimall.coupon.gulimallcoupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gulimall.gulimallcommon.utils.PageUtils;
import com.atguigu.gulimall.coupon.gulimallcoupon.entity.SkuLadderEntity;

import java.util.Map;

/**
 * 商品阶梯价格
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2022-06-29 17:03:46
 */
public interface SkuLadderService extends IService<SkuLadderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

