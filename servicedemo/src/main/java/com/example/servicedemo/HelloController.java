package com.example.servicedemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/say")
    public  String  say(){
        return "我是服务";
    }
}
