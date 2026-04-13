package com.example;

public class Main {

    public static void main(String[] args) {

        Service service = new Service();

        String result = service.resetPassword("1234", "Anusha-agile");

        System.out.println(result);
        System.out.println("Updated Password: " + service.getCurrentPassword());
    }
}