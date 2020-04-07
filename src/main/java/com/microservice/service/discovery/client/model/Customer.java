package com.microservice.service.discovery.client.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Customer {

    private String name;
    private String surname;
    private String gender;
    private String address;
    private String phone;
    private int age;
    private int balance;

}
