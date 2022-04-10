package com.jobbie.customer;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email) {
}
