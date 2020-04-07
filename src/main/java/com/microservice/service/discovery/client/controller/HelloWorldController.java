package com.microservice.service.discovery.client.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping(path = "/greeting")
    public String gretingEndpoint() {
        return "Hello World!";
    }

}
