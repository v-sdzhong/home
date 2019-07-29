package com.example.jobdemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/say")
    public String say(){

        return "我是job,7.29,是最新的文件，哈哈哈，不要怀疑";
    }
}
