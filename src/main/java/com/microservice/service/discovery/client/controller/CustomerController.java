package com.microservice.service.discovery.client.controller;

import com.microservice.service.discovery.client.model.Customer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
public class CustomerController {

    @GetMapping("/customers")
    public List<Customer> getCustomer() {
        return Stream.of(
                Customer.builder().name("Ionescu").surname("Ion").age(25).build(),
                Customer.builder().name("Popescu").surname("Viorica").age(31).build(),
                Customer.builder().name("Vasile").surname("Elena").age(18).build(),
                Customer.builder().name("Ion").surname("Costel").age(12).build(),
                Customer.builder().name("Ciobanu").surname("Iancu").age(45).build()
        ).collect(Collectors.toList());
    }

    @PostMapping("/customers")
    public Customer updateCustomer(Customer customer) {
        return Customer.builder().name(customer.getName()).surname(customer.getSurname()).age(customer.getBalance()).build();
    }
}
