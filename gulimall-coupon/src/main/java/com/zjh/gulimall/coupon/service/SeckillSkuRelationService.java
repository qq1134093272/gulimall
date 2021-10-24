package com.zjh.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zjh.common.utils.PageUtils;
import com.zjh.gulimall.coupon.entity.SeckillSkuRelationEntity;

import java.util.Map;

/**
 * 秒杀活动商品关联
 *
 * @author zjh
 * @email 1134093272@qq.com
 * @date 2021-10-23 20:16:11
 */
public interface SeckillSkuRelationService extends IService<SeckillSkuRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

