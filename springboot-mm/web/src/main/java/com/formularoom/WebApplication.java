package com.formularoom;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan( basePackages = {"com.formularoom"})
@EnableAutoConfiguration
//@SpringBootApplication
public class WebApplication extends SpringBootServletInitializer {

    public static void main(String args[]) {
        SpringApplication.run(WebApplication.class, args);
    }

}
