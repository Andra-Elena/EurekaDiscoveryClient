package com.microservice.service.discovery.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class HelloWorldController {

    @Value("${user.role}")
    String userRole;

    @GetMapping(path = "/greeting")
    public String gretingEndpoint() {
        return "Hello World! + " + userRole;
    }

}
