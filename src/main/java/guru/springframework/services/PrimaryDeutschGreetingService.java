package guru.springframework.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Profile("de")
@Primary
public class PrimaryDeutschGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "primärer Begrüßungsdienst";
    }
}
