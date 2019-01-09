package com.shiro.springcloue_eureka_feign.interfaces;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @ClassName FeignInterface
 * @Description TODO
 * @Author gengtao
 * @Date 2019/1/9 0009 下午 5:01
 * @Version 1.1
 **/
@FeignClient(value="service",fallback = FeignFallbackService.class)
//这里是要远程调用的服务的名称，即你要调用服务的spring.application.name
//fallback是远程调用失败回调的方法
public interface FeignInterface {
    @GetMapping("/")
    String IndexInfo();
}
