package com.study.mobile_study.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Baozhikuan on 2019/3/2.
 */

@RestController
public class helloworld {
    @RequestMapping("/hello")
    public String home() {
        return "hello docker!";
    }
}
