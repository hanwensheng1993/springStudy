package com.jd.app.order.anno;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author hanwensheng
 * @date 2019/10/28
 * XmlConfig
 */
public class XmlConfig {

    public static void main(String[] args) {
//        XmlBeanFactory xmlBeanFactory = new XmlBeanFactory(new ClassPathResource("spring.xml"));
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Object master = context.getBean("master");
        Object catXml = context.getBean("cat3");
    }
}
