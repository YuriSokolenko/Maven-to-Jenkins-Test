package com.onewinged.test.jenkinstest.services;

import org.springframework.stereotype.Service;

@Service
public class TestRestServiceImpl implements TestRestService {


    @Override
    public void printTestMessage() {
        System.out.println("Hello world, I`m a working java application build by MAVEN");
    }
}
