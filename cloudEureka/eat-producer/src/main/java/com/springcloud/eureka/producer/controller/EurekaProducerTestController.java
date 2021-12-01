package com.springcloud.eureka.producer.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: jiangtao Song
 * @Date: 2021/11/24 16:50
 * @Description:
 */
@RestController
public class EurekaProducerTestController {

    @RequestMapping("/eat")
    public String hello(@RequestParam String name){
        return "come from eat-producer 'eat' " + name;
    }
}
