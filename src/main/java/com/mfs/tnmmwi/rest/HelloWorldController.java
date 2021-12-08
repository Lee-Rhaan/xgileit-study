package com.mfs.tnmmwi;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/testing")
public class HelloWorldController {

    @PostMapping("/test")
    public ResponseEntity<String> displayUserInput(@RequestBody String inputValue) {
        String response = inputValue;
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}