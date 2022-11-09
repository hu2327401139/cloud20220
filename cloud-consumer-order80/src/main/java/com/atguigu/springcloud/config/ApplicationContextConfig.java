package com.atguigu.springcloud.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * 这个类就相当于 application.xml，下面的 @Bean 相当于 <bean id="xxx" class="xxxx" />
 * 在Spring中
 * @author hy 2327401139@qq.com
 * @version 1.0 2022/11/9 21:22
 */
@Configuration
public class ApplicationContextConfig {
    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
