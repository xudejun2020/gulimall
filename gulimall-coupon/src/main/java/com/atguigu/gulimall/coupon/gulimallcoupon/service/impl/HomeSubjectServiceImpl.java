package com.atguigu.gulimall.coupon.gulimallcoupon.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atguigu.gulimall.gulimallcommon.utils.PageUtils;
import com.atguigu.gulimall.gulimallcommon.utils.Query;

import com.atguigu.gulimall.coupon.gulimallcoupon.dao.HomeSubjectDao;
import com.atguigu.gulimall.coupon.gulimallcoupon.entity.HomeSubjectEntity;
import com.atguigu.gulimall.coupon.gulimallcoupon.service.HomeSubjectService;


@Service("homeSubjectService")
public class HomeSubjectServiceImpl extends ServiceImpl<HomeSubjectDao, HomeSubjectEntity> implements HomeSubjectService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<HomeSubjectEntity> page = this.page(
                new Query<HomeSubjectEntity>().getPage(params),
                new QueryWrapper<HomeSubjectEntity>()
        );

        return new PageUtils(page);
    }

}
