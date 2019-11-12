package com.jd.app.order.bean;

import lombok.Data;
import lombok.ToString;

/**
 * @author hanwensheng
 * @date 2019/6/19
 * Cat
 */
@Data
public class Cat {

    private String name;
    private String age;
    private Master master;

}
