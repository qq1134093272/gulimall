package com.zjh.gulimall.product.service.impl;

import com.zjh.gulimall.product.entity.SpuImagesEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zjh.common.utils.PageUtils;
import com.zjh.common.utils.Query;

import com.zjh.gulimall.product.dao.SkuImagesDao;
import com.zjh.gulimall.product.entity.SkuImagesEntity;
import com.zjh.gulimall.product.service.SkuImagesService;


@Service("skuImagesService")
public class SkuImagesServiceImpl extends ServiceImpl<SkuImagesDao, SkuImagesEntity> implements SkuImagesService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<SkuImagesEntity> page = this.page(
                new Query<SkuImagesEntity>().getPage(params),
                new QueryWrapper<SkuImagesEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public void saveImages(Long id, List<String> images) {
        if(images == null || images.size() == 0){

        }else{
            List<SkuImagesEntity> collect = images.stream().map(img -> {
                SkuImagesEntity skuImagesEntity = new SkuImagesEntity();
                skuImagesEntity.setSkuId(id);
                skuImagesEntity.setImgUrl(img);

                return skuImagesEntity;
            }).collect(Collectors.toList());

            this.saveBatch(collect);
        }
    }

}