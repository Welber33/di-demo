package guru.springframework.services;

import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl2 implements TestService2 {
    public static String test2 = "test injection by contructor";

    @Override
    public String testService2() {
        return test2;
    }
}
