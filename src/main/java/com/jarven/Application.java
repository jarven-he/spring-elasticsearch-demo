package com.jarven;

import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;


/**
 * @description:
 * @author: 何佳文
 * @date: 2019-04-23 22:57
 */
@EnableAspectJAutoProxy
@NacosPropertySource(dataId = "wechat-mall", autoRefreshed = true)
@SpringBootApplication(scanBasePackages = {"com.jarven"})
public class Application {

    public static void main(String[] args) {
        System.setProperty("es.set.netty.runtime.available.processors", "false");
        SpringApplication.run(Application.class, args);
    }
}
