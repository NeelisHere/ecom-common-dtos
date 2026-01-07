package com.npaulprojects.ecom.v1.common_dtos.customer;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;

@Builder
public record CustomerDto (
        String id,
        @NotNull(message = "Name is required")
        String name,
        @NotNull(message = "Email is required")
        @Email(message = "The customer email is not correctly formatted")
        String email
) {}
