package com.zjh.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zjh.common.utils.PageUtils;
import com.zjh.gulimall.coupon.entity.SeckillSessionEntity;

import java.util.Map;

/**
 * 秒杀活动场次
 *
 * @author zjh
 * @email 1134093272@qq.com
 * @date 2021-10-23 20:03:59
 */
public interface SeckillSessionService extends IService<SeckillSessionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

