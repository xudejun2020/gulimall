package com.atguigu.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gulimall.gulimallcommon.utils.PageUtils;
import com.atguigu.gulimall.member.entity.GrowthChangeHistoryEntity;
import java.util.Map;

/**
 * 成长值变化历史记录
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2022-07-02 10:40:07
 */
public interface GrowthChangeHistoryService extends IService<GrowthChangeHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

