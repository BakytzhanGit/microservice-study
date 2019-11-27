package com.bakytzhan.microservice_tutoral;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class TestController {

    @GetMapping("hello")
    public String sayHello(){
        return "hello";
    }

}
