package com.bank.democonsumer.controller;

import com.bank.democonsumer.pojo.BankUser;
import com.bank.democonsumer.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DemoController {

    @Autowired
    private DemoService demoService;

    @GetMapping("/hello")
    public String hello() {
        return demoService.hello();
    }

    @GetMapping("/test")
    public String test() {
        return "test ok";
    }

    @GetMapping("/object")
    public BankUser getObject() {
        return demoService.getObject();
    }
}
