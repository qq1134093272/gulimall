/**
  * Copyright 2019 bejson.com 
  */
package com.zjh.gulimall.product.vo;

import lombok.Data;

import java.math.BigDecimal;

/**
 * Auto-generated: 2019-11-26 10:50:34
 * BigDecimal不会丢失精度，用于价格计算
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
@Data
public class Bounds {

    private BigDecimal buyBounds;
    private BigDecimal growBounds;


}