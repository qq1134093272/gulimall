package com.zjh.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zjh.common.utils.PageUtils;
import com.zjh.gulimall.ware.entity.PurchaseEntity;
import com.zjh.gulimall.ware.vo.MergeVo;
import com.zjh.gulimall.ware.vo.PurchaseDoneVo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * 采购信息
 *
 * @author zjh
 * @email 1134093272@qq.com
 * @date 2021-10-23 21:02:03
 */
//@Service
public interface PurchaseService extends IService<PurchaseEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void received(List<Long> ids);

    PageUtils queryPageUnreceive(Map<String, Object> params);

    void mergePurchase(MergeVo mergeVo);

    void done(PurchaseDoneVo doneVo);
}

