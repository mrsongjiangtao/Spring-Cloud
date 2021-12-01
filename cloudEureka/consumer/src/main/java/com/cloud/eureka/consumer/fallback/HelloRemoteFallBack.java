package com.cloud.eureka.consumer.fallback;

import com.cloud.eureka.consumer.consumers.HelloRemote;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Auther: jiangtao Song
 * @Date: 2021/11/25 11:32
 * @Description: 服务熔断降级的调用方法
 */
@Component
public class HelloRemoteFallBack implements HelloRemote {
    @Override
    public String hello(@RequestParam(value = "name") String name) {
        //重写该方法，当服务“发生”熔断会调用这里
        return "hello " + name + ", there happend server fuse by FallBack(Feign Hystrix)";
    }
}
