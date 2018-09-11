package com.example.g24.service;

import com.example.g24.dao.HelloDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService {
    @Autowired
    HelloDao helloDao;
    @Override
    public String hello() {
        return helloDao.hello();
    }
}
