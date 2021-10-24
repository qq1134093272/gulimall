package com.zjh.gulimall.order.dao;

import com.zjh.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author zjh
 * @email 1134093272@qq.com
 * @date 2021-10-23 20:55:28
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
