package com.ace;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@ConfigurationPropertiesScan
public class SpringbootQuickstartApplication {

    public static void main(String[] args) {
        System.out.println("started up");
        SpringApplication.run(SpringbootQuickstartApplication.class, args);
    }

}
