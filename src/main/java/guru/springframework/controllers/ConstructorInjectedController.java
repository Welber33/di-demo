package guru.springframework.controllers;

import guru.springframework.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {
    public GreetingService greetingService;

/*
* we inject by constructor using qualifier and declaring the been (obs: we used @Autowire for injection).
* the only way to use @Qualifier is inside parameter field.
* */
    @Autowired
    public ConstructorInjectedController (@Qualifier("constructorGreetingService") GreetingService greetingService){
        this.greetingService = greetingService;
    }

   public  String sayHello(){
        return greetingService.sayGreeting();
    }
}
