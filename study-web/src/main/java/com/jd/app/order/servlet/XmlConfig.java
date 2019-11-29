package com.jd.app.order.servlet;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 * @author hanwensheng
 * @date 2019/10/28
 * XmlConfig
 */
public class XmlConfig {

    public static void main(String[] args) {
        XmlBeanFactory xmlBeanFactory = new XmlBeanFactory(new ClassPathResource("spring.xml"));
        Object master = xmlBeanFactory.getBean("master");
//        System.out.println(master);
        Object catXml = xmlBeanFactory.getBean("cat3");
//        System.out.println(catXml);
    }
}
