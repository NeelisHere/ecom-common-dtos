package com.npaulprojects.ecom.v1.common_dtos.notificationService.payment;

public record PaymentConfirmationDto(
        String orderReference,
        Double amount,
        PaymentMethod paymentMethod,
        String customerName,
        String customerEmail
) {
}