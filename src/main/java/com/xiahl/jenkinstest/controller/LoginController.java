package com.xiahl.jenkinstest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xiahl
 * @date 2022/1/27 15:04
 * @Desc:
 */
@RestController
@RequestMapping("/test")
public class LoginController {

    @GetMapping("/test")
    public String test(){
        return "nihao";
    }
}
