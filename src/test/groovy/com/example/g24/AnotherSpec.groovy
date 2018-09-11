package com.example.g24

import com.example.g24.service.HelloService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import spock.lang.Specification

@SpringBootTest
class AnotherSpec extends Specification {
    @Autowired
    HelloService service

    def "hello"() {
        given:
        service.hello() >> 'aha'
        expect:
        service.hello() == 'aha'
    }
}