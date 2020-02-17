package guru.springframework.controllers;

import guru.springframework.services.TestServiceImpl2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorTestController2 {
    public TestServiceImpl2 testService;

    @Autowired
    public ConstructorTestController2(@Qualifier("testServiceImpl2") TestServiceImpl2 testService) {
        this.testService = testService;
    }

    public String testInjection(){
        return testService.testService2();
    }
}
