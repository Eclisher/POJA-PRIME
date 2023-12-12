package com.company.base.endpoint.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;
import java.security.SecureRandom;

@RestController
@RequestMapping("/new-prime")
public class NewPrime {
    @GetMapping
    public String getNewPrime() {
        BigInteger probablePrime = BigInteger.probablePrime(10000, new SecureRandom());
        return probablePrime.toString();
    }
}
