package com.jenikens.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestService {

    @RequestMapping(value = "/getName", method = RequestMethod.GET)
    public String getName(){
        return "Heba";
    }
}
