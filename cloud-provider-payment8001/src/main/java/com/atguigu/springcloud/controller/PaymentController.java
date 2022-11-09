package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author hy 2327401139@qq.com
 * @version 1.0 2022/11/8 22:22
 */
@RestController
@Slf4j
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    /**
     * 这里之前 我都是会在参数 Payment payment 前加 @RequestBody 的这样前端需要构建一个body体才可以
     * 现在这里没有，我看老师直接使用 效果和 @RequestParam 一样
     *
     *
     * 有一个bug，在mapper.xml设置了useGeneratedKeys但是这里的result还是返回改变的行数
     * https://juejin.cn/post/7101544174394015757
     * 原来真正的id已经被注入到传参对象的主键对应属性里了，只需要使用插入语句的入参对象的get方法即可获取到正确的自增id
     */
    @PostMapping("/payment/create")
    public CommonResult create(Payment payment) {
        int result = paymentService.create(payment);

        log.info("*****插入结果：" + result);

        if (result > 0) {
            //return new CommonResult(200, "添加成功", payment.getId()); 显示新添加的ID而不是改变行数。
            return new CommonResult(200, "添加成功", result);
        } else {
            return new CommonResult(444, "添加失败");
        }

    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id) {

        Payment result = paymentService.getPaymentById(id);

        log.info("*****查询结果：" + result);

        if (result != null) {
            return new CommonResult(200, "查询成功", result);
        } else {
            return new CommonResult(444, "查询" + id + "没有找到结果");
        }

    }

}
