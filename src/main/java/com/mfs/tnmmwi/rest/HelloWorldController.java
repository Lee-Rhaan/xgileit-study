package com.mfs.tnmmwi;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.mfs.tnmmwi.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/testing")
public class HelloWorldController {

    @Autowired
    private HelloWorldService helloWorldService;

    @PostMapping("/test")
    public ResponseEntity<String> displayUserInput(@RequestBody String request) {

        String response = helloWorldService.displayUserInput(request);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}