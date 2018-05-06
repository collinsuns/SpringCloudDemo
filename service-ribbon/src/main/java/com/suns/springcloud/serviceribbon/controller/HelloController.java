package com.suns.springcloud.serviceribbon.controller;

import com.netflix.discovery.converters.Auto;
import com.suns.springcloud.serviceribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Project Name: springcloud
 * User: Suns
 * Date: 2018-04-28 10:11
 * Copyright(c) 2017 Virtue Intelligent Network Ltd, co. All Rights Reserved.
 */
@RestController
public class HelloController {
    @Autowired
    HelloService helloService;

    @RequestMapping(value = "/hi")
    public String hi(@RequestParam String name) {
        return helloService.hiService(name);
    }
}
