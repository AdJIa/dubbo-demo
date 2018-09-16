package com.jia.dubbodemo.provider.bootstrap;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@DubboComponentScan("com.jia.dubbodemo.provider")
public class DubboDemoProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubboDemoProviderApplication.class, args);
    }
}
