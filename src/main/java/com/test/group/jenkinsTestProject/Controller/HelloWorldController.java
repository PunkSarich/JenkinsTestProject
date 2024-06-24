package com.test.group.jenkinsTestProject.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController{

    @PostMapping(value = "/helloworld")
    public String welfareZoneInsert() {
        return "HelloWorld";
    }
}