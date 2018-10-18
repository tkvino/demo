package com.example.demo.controller;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller
//@RequestMapping("/demo")
@RestController("/demo")
public class DemoController {

    @ResponseBody
    @RequestMapping(method = GET, produces = "application/json")
    public String demo() {
        return "{\"hello\":\"world\"}";
    }
}