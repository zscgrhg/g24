package com.example.g24.service;


import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface HelloService {
    String hello();
}
