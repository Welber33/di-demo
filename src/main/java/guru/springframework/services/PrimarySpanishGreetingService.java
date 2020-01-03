package guru.springframework.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;

@Component
@Profile("es")
@Primary
public class PrimarySpanishGreetingService implements GreetingService{

    @Override
    public String sayGreeting() {
        return "Hola!! - Servicio de Saludo Primario";
    }
}
