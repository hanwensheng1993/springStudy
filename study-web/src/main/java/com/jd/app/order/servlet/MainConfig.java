package com.jd.app.order.servlet;

import com.jd.app.order.bean.Cat;
import com.jd.app.order.bean.Master;
import com.jd.app.order.beanfactory.BirdFactoryBean;
import com.jd.app.order.condition.MasterCondition;
import com.jd.app.order.importSelect.MyImportSelector;
import com.jd.app.order.importbeandefinitionregistor.MyBeanDefinitionRegistor;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.EmbeddedValueResolverAware;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringValueResolver;

/**
 * @author hanwensheng
 * @date 2019/9/17
 * MainConfig
 */
@Configuration
@PropertySource(value = {"classpath:springStudy.properties"})
@ComponentScan(basePackages = {"com.jd.app.order"},
        excludeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION, value = Controller.class)})
@Import({OtherConf.class, MyImportSelector.class, MyBeanDefinitionRegistor.class})
public class MainConfig implements EmbeddedValueResolverAware{

    @Getter
    private String myName;

    @Bean(autowire = Autowire.NO)
//    @Scope(value = "prototype")
    Master master() {
        return new Master();
    }

    @Bean(initMethod = "init",destroyMethod = "destroy",name = {"cat2","cat","cat3"})
    @Conditional(value = {MasterCondition.class})
//    @Profile("dev")
    public Cat cat() {
        return new Cat();
    }

    @Bean
    public BirdFactoryBean birdFactoryBean(){
        return new BirdFactoryBean();
    }

//    @Bean
//    public List cats(){
//        return Arrays.asList("1","2");
//    }

    /**
     * Set the StringValueResolver to use for resolving embedded definition values.
     *
     * @param resolver
     */
    @Override
    public void setEmbeddedValueResolver(StringValueResolver resolver) {
        myName = resolver.resolveStringValue("${me.name}");
    }
}
