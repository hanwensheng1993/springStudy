package com.jd.app.order.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author hanwensheng
 * @date 2019/12/2
 * AopMain
 */
public class AopMain {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopConf.class);
        Printer printer = (Printer) context.getBean("printer");
        printer.print("firstStr","secondStr");
    }

}
