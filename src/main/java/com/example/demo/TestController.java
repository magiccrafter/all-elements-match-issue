package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {

    @GetMapping(value = "/rest/test")
    public List<Test> fetchAll() {
        return List.of(Test.of("1L9zO9O"), Test.of("1L9zO91"));
    }
}
