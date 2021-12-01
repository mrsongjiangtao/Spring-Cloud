package com.cloud.eureka.consumer.controller;

import com.cloud.eureka.consumer.consumers.HelloRemote;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Auther: jiangtao Song
 * @Date: 2021/11/24 17:14
 * @Description:
 */
@RestController
public class HelloController {
    @Resource
    private HelloRemote helloRemote;

    @RequestMapping("/hello/{name}")
    public String index(@PathVariable("name") String name) {
        return helloRemote.hello(name);
    }
}
