package guru.springframework;

import guru.springframework.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringmvcApplication {

    public static void main(String[] args) {

        ApplicationContext ctx = SpringApplication.run(SpringmvcApplication.class, args);

       // ApplicationContext context = new ClassPathXmlApplicationContext(args);

      //  ApplicationContext context1 = SpringApplication.run(SpringApplication.class, args);

        MyController controller = (MyController) ctx.getBean("myController");

        controller.hello();
        System.out.println(controller.hello());
        System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
        System.out.println(ctx.getBean(SetterInjectedController.class).sayHello());

        //get the information by the bean
        System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());
        System.out.println();
        //System.out.println(ctx.getBean(ConstructorTestController.class).test());
        //System.out.println(ctx.getBean(ConstructorTestController.class).test2());
        System.out.println(ctx.getBean(ConstructorTestController2.class).testInjection());

    }
}
