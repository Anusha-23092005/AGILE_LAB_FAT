package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ServiceTest {

    Service service = new Service();

    @Test
    public void testCase1() {
        double result = service.calculateValue(10, 5, true);
        assertEquals(50.0, result, 0.01);
    }

    @Test
    public void testCase2() {
        double result = service.calculateValue(10, 5, false);
        assertEquals(15.0, result, 0.01);
    }
}