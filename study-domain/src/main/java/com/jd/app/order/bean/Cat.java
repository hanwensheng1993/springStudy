package com.jd.app.order.bean;

import lombok.Data;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;

/**
 * @author hanwensheng
 * @date 2019/6/19
 * Cat
 */
@Data
@ToString
public class Cat {

    @Value("tom")
    private String name;
    @Value("#{18-4}")
    private String age;
    @Value("${cat.area}")
    private String area;
    private Master master;

    public void init(){
        System.out.println("Cat init");
    }

    public void destroy(){
        System.out.println("Cat destory");
    }
}
