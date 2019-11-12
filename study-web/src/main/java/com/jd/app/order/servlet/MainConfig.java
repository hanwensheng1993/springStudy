package com.jd.app.order.servlet;

import com.jd.app.order.bean.Cat;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * @author hanwensheng
 * @date 2019/9/17
 * MainConfig
 */
@Configuration
@Conditional(value = {})
public class MainConfig {

    @Bean
    public Cat cat(){
        return new Cat();
    }

}
