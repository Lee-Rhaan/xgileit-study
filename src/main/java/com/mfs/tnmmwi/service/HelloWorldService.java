package com.mfs.tnmmwi.service;

import org.springframework.stereotype.Service;
import com.mfs.tnmmwi.persistence.HelloWorldRepository;

@Service
public class HelloWorldService implements HelloWorldRepository {

    @Override
    public String displayUserInput(String request) {
        return request;
    }
}