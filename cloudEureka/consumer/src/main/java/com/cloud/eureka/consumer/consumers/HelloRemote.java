package com.cloud.eureka.consumer.consumers;

import com.cloud.eureka.consumer.fallback.HelloRemoteFallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Auther: jiangtao Song
 * @Date: 2021/11/24 17:13
 * @Description: 这里定义一堆远程调用的接口，来响应注册到注册中心的producer
 */
@FeignClient(name = "sjt-test-producer", fallback = HelloRemoteFallBack.class)
public interface HelloRemote {

    @RequestMapping(value = "/hello")
    String hello(@RequestParam(value = "name") String name);
}
