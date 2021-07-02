package com.jbm.springdatajpae1.test.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class TestController {

    @RequestMapping(method = RequestMethod.GET, path = "/test")
    public String test(){
        return "Test!";
    }

}
