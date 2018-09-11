package com.example.g24

import com.example.g24.dao.HelloDao
import com.example.g24.service.HelloService
import org.spockframework.spring.UnwrapAopProxy
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.context.TestConfiguration
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Import
import spock.lang.Specification
import spock.mock.DetachedMockFactory

@SpringBootTest
@Import(MockConfig)
class HelloSpec extends Specification {
    @Autowired
    @UnwrapAopProxy
    HelloDao dao
    @Autowired
    HelloService service

    def "hello"() {
        given:
        dao.hello() >> 'aha'
        expect:
        service.hello() == 'aha'
    }


}

@TestConfiguration
class MockConfig {
    def detachedMockFactory = new DetachedMockFactory()

    @Bean
    HelloDao helloDao() {
        return detachedMockFactory.Mock(HelloDao)
    }
}