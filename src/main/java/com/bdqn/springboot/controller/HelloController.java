package com.bdqn.springboot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*@ResponseBody
@Controller*/
//Controller和ResponseBody结合
@RestController
public class HelloController {
    //value属性注入
    @Value("${person.name}")
    private String name;

    @RequestMapping("/hello")
    public String hello() {
        return "Hello world1" + name;
    }
}
