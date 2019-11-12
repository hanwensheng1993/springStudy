package com.jd.app.order.bean;

import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
 * @author hanwensheng
 * @date 2019/6/19
 * Master
 */
@Data
@ToString
public class Master {

    private String name;
    private String age;
    private List<Cat> cats;

}
