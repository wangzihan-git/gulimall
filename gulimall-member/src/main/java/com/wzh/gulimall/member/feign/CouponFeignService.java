package com.wzh.gulimall.member.feign;

import com.wzh.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 远程调用微服务的接口，声明式远程调用
 */

//通过服务名调用远程服务
@FeignClient("gulimall-coupon")
public interface CouponFeignService {
    //请求的地址就是方法在远程服务中的地址，方法签名必须和远程方法一致
    @RequestMapping("/coupon/coupon/member/list")
    public R membercoupons();//得到一个R对象
}
