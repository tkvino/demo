package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/demo")
public class DemoController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello() {
        return "{\"hello\":\"world\"}";
    }
}