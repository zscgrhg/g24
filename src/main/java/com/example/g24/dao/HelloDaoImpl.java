package com.example.g24.dao;

import org.springframework.stereotype.Component;

@Component
public class HelloDaoImpl implements HelloDao {
    @Override
    public String hello() {
        return "haha dao";
    }
}
