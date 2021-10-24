package com.zjh.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zjh.common.utils.PageUtils;
import com.zjh.gulimall.member.entity.GrowthChangeHistoryEntity;

import java.util.Map;

/**
 * 成长值变化历史记录
 *
 * @author zjh
 * @email 1134093272@qq.com
 * @date 2021-10-23 20:37:14
 */
public interface GrowthChangeHistoryService extends IService<GrowthChangeHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

