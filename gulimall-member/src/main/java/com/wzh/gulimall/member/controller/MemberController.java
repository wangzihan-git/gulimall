package com.wzh.gulimall.member.controller;

import java.util.Arrays;
import java.util.Map;


import com.wzh.gulimall.member.feign.CouponFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wzh.gulimall.member.entity.MemberEntity;
import com.wzh.gulimall.member.service.MemberService;
import com.wzh.common.utils.PageUtils;
import com.wzh.common.utils.R;



/**
 * 会员
 *
 * @author wzh
 * @email 3471188738@qq.com
 * @date 2021-08-29 22:44:02
 */
@RestController
@RequestMapping("member/member")
public class MemberController {
    @Autowired
    private MemberService memberService;

    //自动注入远程调用对象
    @Autowired
    CouponFeignService couponFeignService;

    /**
     * 远程调用优惠卷服务
     *
     */
    @RequestMapping("/coupons")
    public R test(){
        MemberEntity memberEntity = new MemberEntity();
        memberEntity.setNickname("张三");
        //假设张三去数据库查了后返回了张三的优惠券信息
        R membercoupons = couponFeignService.membercoupons();

        // 打印会员和优惠券信息
        // R的本质就是一个map,可以存储键值对
        return R.ok().put("member",memberEntity).put("coupons",membercoupons.get("coupons"));
    }



    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("member:member:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = memberService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    //@RequiresPermissions("member:member:info")
    public R info(@PathVariable("id") Long id){
		MemberEntity member = memberService.getById(id);

        return R.ok().put("member", member);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("member:member:save")
    public R save(@RequestBody MemberEntity member){
		memberService.save(member);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("member:member:update")
    public R update(@RequestBody MemberEntity member){
		memberService.updateById(member);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("member:member:delete")
    public R delete(@RequestBody Long[] ids){
		memberService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
