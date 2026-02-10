package com.community.demo.models;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloWorldModelTest {

    @Test
    public void testDefaultMessage() {
        HelloWorldModel model = new HelloWorldModel();
        assertEquals("Hello World!", model.getMessage());
    }
}
