package com.chenws.docker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by chenws on 2020/4/30.
 */
@Controller
public class TestController {

    @GetMapping("/")
    public String test(){
        return "index";
    }

}
