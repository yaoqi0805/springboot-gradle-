package com.formularoom.mata_annotation;

import java.lang.annotation.*;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface FruitColor {

    /**
     * 颜色枚举
     * @author peida
     *
     */
    public enum Color{ BULE,RED,GREEN};

    /**
     * 颜色
     */
    Color fruitColor()default Color.RED;
}
