package guru.springframework.services;

import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {
    public static String testVariable = "injeção de construtor feita com sucesso";
    public static String testVariable2 = "novo teste aplicado";

    @Override
    public String teste() {
        //return "injeção de construtor feita com sucesso";
        return testVariable;
    }

    @Override
    public String teste2() {
        return testVariable2;
    }
}
