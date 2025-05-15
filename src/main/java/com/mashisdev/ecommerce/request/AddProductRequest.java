package com.mashisdev.ecommerce.request;

import com.mashisdev.ecommerce.model.Category;
import jakarta.validation.constraints.*;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class AddProductRequest {

    private Long id;

    @NotBlank(message = "Name is required.")
    @Size(min = 2, max = 100, message = "Name must be between 2 and 100 characters.")
    private String name;

    @NotBlank(message = "Brand is required.")
    @Size(min = 2, max = 100, message = "Brand must be between 2 and 100 characters.")
    private String brand;

    @NotNull(message = "Price is required.")
    @DecimalMin(value = "0.01", inclusive = true, message = "Price must be greater than 0.")
    @Digits(integer = 10, fraction = 2, message = "Price must be a valid amount with up to 2 decimal places.")
    private BigDecimal price;

    @Min(value = 0, message = "Inventory cannot be negative.")
    @Max(value = 1000000, message = "Inventory value is too large.")
    private int inventory;

    @NotBlank(message = "Description is required.")
    @Size(max = 1000, message = "Description must be at most 1000 characters.")
    private String description;

    @NotNull(message = "Category is required.")
    private Category category;
}
