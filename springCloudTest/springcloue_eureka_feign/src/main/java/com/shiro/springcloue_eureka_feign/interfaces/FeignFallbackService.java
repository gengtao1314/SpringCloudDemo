package com.shiro.springcloue_eureka_feign.interfaces;

import org.springframework.stereotype.Service;

/**
 * @ClassName FeignFallbackService
 * @Description TODO
 * @Author gengtao
 * @Date 2019/1/9 0009 下午 4:24
 * @Version 1.1
 **/
@Service
public class FeignFallbackService implements FeignInterface {
    @Override
    public String IndexInfo() {
        return "远程调用失败";
    }
}
