package com.jd.app.order.servlet;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author hanwensheng
 * @date 2019/9/17
 * ConfigurationAnno
 */
public class ConfigurationAnno {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);
        Object cat = context.getBean("cat");
        System.out.println(cat);
    }

}
