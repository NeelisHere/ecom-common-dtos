package com.npaulprojects.ecom.v1.common_dtos.notificationService.product;

public record ProductDto(
        Integer productId,
         String name,
         String description,
         Double price,
         Integer quantity
) {
}
