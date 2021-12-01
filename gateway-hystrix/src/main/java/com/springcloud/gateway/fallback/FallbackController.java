package com.springcloud.gateway.fallback;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: jiangtao Song
 * @Date: 2021/12/1 11:41
 * @Description:
 */
@RestController
public class FallbackController {

    @RequestMapping("/fallback")
    public String fallback(){
        System.out.println("服务熔断");
        return "break service is success";
    }
}
