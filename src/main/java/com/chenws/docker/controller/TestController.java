package com.chenws.docker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by chenws on 2020/4/30.
 */
@RestController
public class TestController {

    @GetMapping("/")
    public String test(){
        return "index";
    }

}
