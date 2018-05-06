package com.suns.springcloud.sericefeign.service;

import org.springframework.stereotype.Component;

/**
 * Project Name: springcloud
 * User: Suns
 * Date: 2018-05-04 16:31
 * Copyright(c) 2017 Virtue Intelligent Network Ltd, co. All Rights Reserved.
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
