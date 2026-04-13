package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ServiceTest {

    Service service = new Service();

    @Test
    public void testInvalidOtp() {
        String result = service.resetPassword("9999", "newPass456");
        assertEquals("OTP verification failed", result);
    }

    @Test
    public void testShortPassword() {
        String result = service.resetPassword("1234", "123");
        assertEquals("Password too short", result);
    }

    @Test
    public void testSuccessfulReset() {
        String result = service.resetPassword("1234", "newPass456");
        assertEquals("Password reset successful", result);
    }
}