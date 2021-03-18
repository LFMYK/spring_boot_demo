package com.example.demo.controller;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Test;

//https://github.com/LFMYK/spring_boot_demo.git

@RestController
public class TestController {
	

    private static final String template = "这个第三次修改，Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/test")
    public Test dealTest(@RequestParam(value="name", defaultValue="World") String name) {
        return new Test(counter.incrementAndGet(),
                            String.format(template, name));
    }
    @RequestMapping("/test1")
    public Test dealTest1(@RequestParam(value="name", defaultValue="World") String name) {
        return new Test(counter.incrementAndGet(),
                            String.format(template, name));
    }
    //第二次提交
}