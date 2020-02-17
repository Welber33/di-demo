package guru.springframework.controllers;

import guru.springframework.services.TestServiceImpl2;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ConstructorInjectedController2 {
    public ConstructorTestController2 constructorTestController2;

    @Before
    public void setUp() throws Exception{
        this.constructorTestController2 = new ConstructorTestController2(new TestServiceImpl2());
    }
    @Test
    public void testConstructorInjectedController2() throws Exception{
        assertEquals(TestServiceImpl2.test2, constructorTestController2.testInjection());
    }

}
