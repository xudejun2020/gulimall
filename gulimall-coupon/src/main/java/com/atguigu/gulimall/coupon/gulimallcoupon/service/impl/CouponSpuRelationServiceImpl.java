package com.atguigu.gulimall.coupon.gulimallcoupon.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atguigu.gulimall.gulimallcommon.utils.PageUtils;
import com.atguigu.gulimall.gulimallcommon.utils.Query;

import com.atguigu.gulimall.coupon.gulimallcoupon.dao.CouponSpuRelationDao;
import com.atguigu.gulimall.coupon.gulimallcoupon.entity.CouponSpuRelationEntity;
import com.atguigu.gulimall.coupon.gulimallcoupon.service.CouponSpuRelationService;


@Service("couponSpuRelationService")
public class CouponSpuRelationServiceImpl extends ServiceImpl<CouponSpuRelationDao, CouponSpuRelationEntity> implements CouponSpuRelationService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CouponSpuRelationEntity> page = this.page(
                new Query<CouponSpuRelationEntity>().getPage(params),
                new QueryWrapper<CouponSpuRelationEntity>()
        );

        return new PageUtils(page);
    }

}
