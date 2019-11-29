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
//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
//        context.getEnvironment().setActiveProfiles("dev");
//        context.register(MainConfig.class);
//        context.refresh();
        Object bird = context.getBean("birdFactoryBean");
        System.out.println(bird);
//        Object bird1 = context.getBean("birdFactoryBean");
//        System.out.println(bird1);
        Object birdFactoryBean = context.getBean("&birdFactoryBean");
        System.out.println(birdFactoryBean);
//        System.out.println(context.getBean("cat"));
//        System.out.println(context.getBean("mainConfig",MainConfig.class).getMyName());
//        Arrays.stream(context.getBeanDefinitionNames()).forEach(s -> System.out.println(s));
        System.out.println(context.getBean("master"));
        context.close();
    }

}
