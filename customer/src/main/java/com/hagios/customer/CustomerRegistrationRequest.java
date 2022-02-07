package com.hagios.customer;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email) {
}
