package com.linkedbear.spring.postprocessor.a_quickstart;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanPostProcessorQuickstartApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
                "com.linkedbear.spring.postprocessor.a_quickstart"
        );
        applicationContext.close();
    }
}
