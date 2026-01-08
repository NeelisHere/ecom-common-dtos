package com.npaulprojects.ecom.v1.common_dtos.notificationService.customer.orderService;

import com.npaulprojects.ecom.v1.common_dtos.customer.notificationService.CustomerDto;
import com.npaulprojects.ecom.v1.common_dtos.notificationService.payment.PaymentMethod;
import com.npaulprojects.ecom.v1.common_dtos.notificationService.product.ProductDto;

import java.util.List;

public record OrderConfirmationDto(
        String orderReference,
        Double totalAmount,
        PaymentMethod paymentMethod,
        CustomerDto customer,
        List<ProductDto> products
) {
}
