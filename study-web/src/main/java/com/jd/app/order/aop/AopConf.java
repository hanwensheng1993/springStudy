package com.jd.app.order.aop;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author hanwensheng
 * @date 2019/12/2
 * AopConf
 */
//@EnableTransactionManagement
//@EnableAspectJAutoProxy
@EnableAspectJAutoProxy(exposeProxy = true)
//@EnableAspectJAutoProxy(proxyTargetClass = true)
public class AopConf {

    @Bean
    public PrinterImpl printer(){
        return new PrinterImpl();
    }

    @Bean
    public LogAop logAop(){
        return new LogAop();
    }
}
