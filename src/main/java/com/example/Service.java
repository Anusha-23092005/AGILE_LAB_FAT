package com.example;

public class Service {

    private String storedOtp = "1234";
    private String currentPassword = "oldPass123";

    public String resetPassword(String enteredOtp, String newPassword) {

        if (enteredOtp == null || newPassword == null) {
            return "Invalid input";
        }

        if (!enteredOtp.equals(storedOtp)) {
            return "OTP verification failed";
        }

        if (newPassword.length() < 6) {
            return "Password too short";
        }

        currentPassword = newPassword;
        return "Password reset successful";
    }

    public String getCurrentPassword() {
        return currentPassword;
    }
}