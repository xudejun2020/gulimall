package com.atguigu.gulimall.coupon.gulimallcoupon.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atguigu.gulimall.gulimallcommon.utils.PageUtils;
import com.atguigu.gulimall.gulimallcommon.utils.Query;
import com.atguigu.gulimall.coupon.gulimallcoupon.dao.CouponHistoryDao;
import com.atguigu.gulimall.coupon.gulimallcoupon.entity.CouponHistoryEntity;
import com.atguigu.gulimall.coupon.gulimallcoupon.service.CouponHistoryService;


@Service("couponHistoryService")
public class CouponHistoryServiceImpl extends ServiceImpl<CouponHistoryDao, CouponHistoryEntity> implements CouponHistoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CouponHistoryEntity> page = this.page(
                new Query<CouponHistoryEntity>().getPage(params),
                new QueryWrapper<CouponHistoryEntity>()
        );

        return new PageUtils(page);
    }

}
