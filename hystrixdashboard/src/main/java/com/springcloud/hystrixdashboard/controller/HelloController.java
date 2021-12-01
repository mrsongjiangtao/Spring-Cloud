package com.springcloud.hystrixdashboard.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: jiangtao Song
 * @Date: 2021/11/26 11:00
 * @Description:
 */
@RestController
public class HelloController {

    @RequestMapping("/hello/{name}")
    public String index(@PathVariable("name") String name) {
        return "hello " + name;
    }
}
