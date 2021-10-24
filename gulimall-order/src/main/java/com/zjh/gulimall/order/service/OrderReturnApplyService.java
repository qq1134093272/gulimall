package com.zjh.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zjh.common.utils.PageUtils;
import com.zjh.gulimall.order.entity.OrderReturnApplyEntity;

import java.util.Map;

/**
 * 订单退货申请
 *
 * @author zjh
 * @email 1134093272@qq.com
 * @date 2021-10-23 20:55:28
 */
public interface OrderReturnApplyService extends IService<OrderReturnApplyEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

