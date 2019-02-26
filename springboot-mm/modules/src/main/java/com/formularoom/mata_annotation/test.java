package com.formularoom.mata_annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class test {

    public static void main(String [] args) throws NoSuchMethodException {
        Apple apple = new Apple();
        apple.setAppleColor("cc");

        Field[] fields = Apple.class.getDeclaredFields();

        for (Field field : fields) {
            if (field.isAnnotationPresent(FruitName.class)){
                FruitName fruitName = field.getAnnotation(FruitName.class);
                System.out.println(fruitName.value());
            }
            if (field.isAnnotationPresent(FruitColor.class)){
                FruitColor fruitColor = field.getAnnotation(FruitColor.class);
                System.out.println(fruitColor.fruitColor());
            }

            Annotation[] allFAnnos = field.getAnnotations();
            for (Annotation annotation : allFAnnos)
            {
                // 遍历所有注解的名字
                System.out.println(annotation.annotationType().getName());
                System.out.println(annotation.toString());
            }
            System.out.println("**************************************************\n");
        }
    }
}
