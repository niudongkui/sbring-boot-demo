package com.bdqn.springboot.config;

import com.bdqn.springboot.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//声明一个配置类用来替代spring的配置文件
@Configuration
public class MyAppConfig {


    //将方法的返回值添加到容器中 默认方法名就是组件id名
    @Bean
    public HelloService helloService() {
        System.out.println("配置类@Bean给容器中添加组件");
        return new HelloService();
    }
}
