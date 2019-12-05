package com.jd.app.order.bean;

import lombok.Data;
import lombok.ToString;
import org.springframework.stereotype.Component;

/**
 * @author hanwensheng
 * @date 2019/11/29
 * SmallCat
 */
@Data
@ToString
@Component
public class SmallCat extends Cat {

    private Mouse mouse;
//    public SmallCat(){
//
//    }
//    @Autowired
//    public SmallCat(Mouse mouse,Master master) {
//        this.mouse = mouse;
//        super.master = master;
//    }
}
