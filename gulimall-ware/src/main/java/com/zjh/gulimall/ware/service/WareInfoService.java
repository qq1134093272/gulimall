package com.zjh.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zjh.common.utils.PageUtils;
import com.zjh.gulimall.ware.entity.WareInfoEntity;

import java.util.Map;

/**
 * 仓库信息
 *
 * @author zjh
 * @email 1134093272@qq.com
 * @date 2021-10-23 21:02:03
 */
public interface WareInfoService extends IService<WareInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

