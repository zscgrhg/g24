package com.example.g24

import com.example.g24.dao.HelloDao
import com.example.g24.service.HelloService
import org.spockframework.spring.SpringBean
import org.spockframework.spring.UnwrapAopProxy
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import spock.lang.Specification

@SpringBootTest
class HelloSpec extends Specification {
    @SpringBean
    @UnwrapAopProxy
    HelloDao dao = Mock(){
        hello() >> 'aha'
    }
    @Autowired
    HelloService service

    def "hello"() {

        expect:
        service.hello() == 'aha'
    }


}