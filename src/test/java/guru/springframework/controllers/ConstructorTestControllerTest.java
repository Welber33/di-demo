package guru.springframework.controllers;

import guru.springframework.services.TestServiceImpl;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class ConstructorTestControllerTest {
    public ConstructorTestController constructorTestController;

    @Before
    public void setUp() throws Exception {
        this.constructorTestController = new ConstructorTestController(new TestServiceImpl());
    }

    @Test
    public void testInjectedController() throws Exception {
        assertEquals(TestServiceImpl.testVariable, constructorTestController.test());
        assertEquals(TestServiceImpl.testVariable2, constructorTestController.test2());
    }
}
