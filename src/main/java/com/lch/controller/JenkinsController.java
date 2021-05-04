package com.lch.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JenkinsController {


    @GetMapping("jenkinsBuild")
    public String jenkinsBuild(){
        return "jenkins构建成功 欧耶！！！";
    }
}
