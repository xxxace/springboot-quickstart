package com.ace.controller;

import com.ace.domain.YmlProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloSpringbootController {

    @Value("${mytest.name}")
    private String hello;

    @Autowired
    private Environment environment;

    @Autowired
    private YmlProperties ymlProperties;

    @GetMapping("/{msg}")
    public String hello(@PathVariable String msg) {
        System.out.println("msg = " + msg);
        return "hello springboot " + msg;
    }

    @GetMapping
    public String hello2() {
        String msg = "f";
        System.out.println(hello);
        String mytest = environment.getProperty("mytest.name");
        System.out.println(mytest);
        System.out.println(ymlProperties);
        System.out.println("msg = " + msg);
        return "hello springboot " + msg;
    }
}
