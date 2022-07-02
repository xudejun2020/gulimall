package com.atguigu.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gulimall.gulimallcommon.utils.PageUtils;
import com.atguigu.gulimall.ware.entity.PurchaseEntity;
import java.util.Map;

/**
 * 采购信息
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2022-07-02 12:07:08
 */
public interface PurchaseService extends IService<PurchaseEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

