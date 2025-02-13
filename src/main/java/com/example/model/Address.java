package com.example.model;

import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.*;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Address {              //validation for Address

    @NotBlank(message = "Detailed address is required")
    private String detailedAddress;

    @NotBlank(message = "City is required")
    private String city;

    @NotBlank(message = "State is required")
    private String state;

    @Pattern(regexp = "^\\d{6}$", message = "Pincode must be a 6-digit number")     // RegExp validation for pincode
    private String pincode;
}
