package com.snaildev.hellospringboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

@Controller
@RequestMapping("/")
public class HelloController {

    @ResponseBody
    @RequestMapping("hello")
    public String hello() {
        return "Hello, Spring Boot";
    }

    @RequestMapping("hello1")
    public String view(Map<String, Object> map) {
        map.put("name", "SpringBoot");
        map.put("date", new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
        return "index";
    }
}
