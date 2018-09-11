package com.example.g24.dao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class HelloDaoImpl implements HelloDao {
    @Override
    public String hello() {
        return "haha dao";
    }
}
