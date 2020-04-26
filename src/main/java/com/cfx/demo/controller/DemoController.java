package com.cfx.demo.controller;

import com.cfx.demo.service.DemoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class DemoController {

    @Resource
    private DemoService demoService;

    @GetMapping("/demo")
    public String demo() {
        return demoService.demo();
    }
}
