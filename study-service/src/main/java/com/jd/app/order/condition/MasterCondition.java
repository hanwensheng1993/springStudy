package com.jd.app.order.condition;


import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @author hanwensheng
 * @date 2019/11/13
 * MasterCondition
 */
public class MasterCondition implements Condition {

    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
//        String[] beanDefinitionNames = conditionContext.getBeanFactory().getBeanDefinitionNames();
//        for (String name : beanDefinitionNames){
//            System.out.println(name);
//            if ("master".equals(name)){
//                return true;
//            }
//        }
        boolean master = conditionContext.getBeanFactory().containsBean("master");
        System.out.println(master);
        System.out.println("----------------------------");
        return master;
    }
}
