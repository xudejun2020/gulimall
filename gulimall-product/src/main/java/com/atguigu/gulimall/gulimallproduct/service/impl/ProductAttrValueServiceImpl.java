package com.atguigu.gulimall.gulimallproduct.service.impl;

import com.atguigu.gulimall.gulimallcommon.utils.PageUtils;
import com.atguigu.gulimall.gulimallcommon.utils.Query;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atguigu.gulimall.gulimallproduct.dao.ProductAttrValueDao;
import com.atguigu.gulimall.gulimallproduct.entity.ProductAttrValueEntity;
import com.atguigu.gulimall.gulimallproduct.service.ProductAttrValueService;


@Service("productAttrValueService")
public class ProductAttrValueServiceImpl extends ServiceImpl<ProductAttrValueDao, ProductAttrValueEntity> implements ProductAttrValueService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<ProductAttrValueEntity> page = this.page(
                new Query<ProductAttrValueEntity>().getPage(params),
                new QueryWrapper<ProductAttrValueEntity>()
        );

        return new PageUtils(page);
    }

}
