package guru.springframework.controllers;

import guru.springframework.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {
    private GreetingService greetingService;

    /*
    * different of the constructor we can use the annotation above the method and declare the bean
    * */
    @Autowired
    @Qualifier("setterGreetingService")
    public void setGreetingService(GreetingService greetingService){
        this.greetingService = greetingService;
    }

  public  String sayHello(){
        return greetingService.sayGreeting();
    }

}
