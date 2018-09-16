package com.jia.dubbodemo.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.jia.dubbodemo.api.DemoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 类描述：
 *
 * @author LuJia
 * @date 2018/09/14 18:07
 */
@RestController
public class DemoConsumerController {

    @Reference(
            interfaceClass = DemoService.class,
            version = "${demo.service.version}"
    )
    private DemoService demoService;


    @RequestMapping("/sayHello")
    public String sayHello(@RequestParam String name) {
        return demoService.sayHello(name);
    }
}
