package com.atguigu.gulimall.coupon.dao;

import com.atguigu.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2022-06-29 17:03:46
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
