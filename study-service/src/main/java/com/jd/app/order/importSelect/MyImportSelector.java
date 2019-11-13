package com.jd.app.order.importSelect;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author hanwensheng
 * @date 2019/11/13
 * MyImportSelector
 */
public class MyImportSelector implements ImportSelector {

    /**
     * Select and return the names of which class(es) should be imported based on
     * the {@link AnnotationMetadata} of the importing @{@link org.springframework.context.annotation.Configuration} class.
     *
     * @param importingClassMetadata
     */
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[]{"com.jd.app.order.bean.Sheep"};
    }
}
