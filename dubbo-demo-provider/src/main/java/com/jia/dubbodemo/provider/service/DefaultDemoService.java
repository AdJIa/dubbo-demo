package com.jia.dubbodemo.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.jia.dubbodemo.api.DemoService;

/**
 * 类描述：
 *
 * @author LuJia
 * @date 2018/09/14 16:46
 */
@Service(
        version = "${demo.service.version}",
        application = "${dubbo.application.id}",
        protocol = "${dubbo.protocol.id}",
        registry = "${dubbo.registry.id}"
)
public class DefaultDemoService implements DemoService {

    @Override
    public String sayHello(String name) {
        return "hello " + name;
    }
}
