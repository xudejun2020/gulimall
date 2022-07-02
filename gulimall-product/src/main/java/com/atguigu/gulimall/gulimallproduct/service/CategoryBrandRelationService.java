package com.atguigu.gulimall.gulimallproduct.service;

import com.atguigu.gulimall.gulimallcommon.utils.PageUtils;
import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gulimall.gulimallproduct.entity.CategoryBrandRelationEntity;

import java.util.Map;

/**
 * 品牌分类关联
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2022-06-29 09:59:37
 */
public interface CategoryBrandRelationService extends IService<CategoryBrandRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

