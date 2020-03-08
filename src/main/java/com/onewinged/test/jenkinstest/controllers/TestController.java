package com.onewinged.test.jenkinstest.controllers;


import org.springframework.web.bind.annotation.*;


@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/test-service/")
public class TestController {

    @RequestMapping(value = "print", method= org.springframework.web.bind.annotation.RequestMethod.GET)
    public void printTest() {
        System.out.println("Hello world, I`m a working java application build by MAVEN");
    }
}
