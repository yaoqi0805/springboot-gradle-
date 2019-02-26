package com.formularoom.mata_annotation;

import java.lang.annotation.*;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface FruitName {

    /**
     * 水果名称
     */
    String value()default "苹果";
}
