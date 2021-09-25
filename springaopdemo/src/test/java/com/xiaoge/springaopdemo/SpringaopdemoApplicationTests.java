package com.xiaoge.springaopdemo;

import com.xiaoge.springaopdemo.service.CustomerService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class SpringaopdemoApplicationTests {

    @Autowired
    ApplicationContext ac;

    @Test
    void contextLoads() {
        CustomerService cs = ac.getBean(CustomerService.class);
        cs.register();
    }

}
