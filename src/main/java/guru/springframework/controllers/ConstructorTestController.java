package guru.springframework.controllers;

import guru.springframework.services.TestServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorTestController {
    private TestServiceImpl testService;

    @Autowired
    public ConstructorTestController(@Qualifier("testServiceImpl") TestServiceImpl testService) {
        this.testService = testService;
    }

    public String test(){
        return testService.teste();
    }

    public String test2(){
        return testService.teste2();
    }
}
