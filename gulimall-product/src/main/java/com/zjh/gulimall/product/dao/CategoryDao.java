package com.zjh.gulimall.product.dao;

import com.zjh.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author zjh
 * @email 1134093272@qq.com
 * @date 2021-10-23 21:36:25
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
