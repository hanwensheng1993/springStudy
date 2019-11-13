package com.jd.app.order.importbeandefinitionregistor;

import com.jd.app.order.bean.Mouse;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author hanwensheng
 * @date 2019/11/13
 * MyBeanDefinitionRegistor
 */
public class MyBeanDefinitionRegistor implements ImportBeanDefinitionRegistrar {

    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry){
        RootBeanDefinition rootBeanDefinition = new RootBeanDefinition(Mouse.class);
        registry.registerBeanDefinition("mouse",rootBeanDefinition);
    }
}
