package com.onewinged.test.jenkinstest.services;

import org.springframework.stereotype.Service;

@Service
public class TestRestServiceImpl implements TestRestService {


    @Override
    public String printTestMessage() {
        String s = "Hello world, I`m a working java application build by MAVEN";
        return s;
    }
}
