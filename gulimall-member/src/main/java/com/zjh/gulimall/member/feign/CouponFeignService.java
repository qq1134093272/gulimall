package com.zjh.gulimall.member.feign;

import com.zjh.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 声明这个是一个远程客户端,需要写完整远程接口服务路径,远程服务名+远程服务接口名
 */

@FeignClient("gulimall-coupon")
public interface CouponFeignService {

    @RequestMapping("/coupon/coupon/member/list")
    public R membercoupons();
}
