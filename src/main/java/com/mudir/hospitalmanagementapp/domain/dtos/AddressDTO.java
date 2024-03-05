package com.mudir.hospitalmanagementapp.domain.dtos;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record AddressDTO(@NotBlank(message="AddressLine cannot be blank")
                         String AddressLine,

                         @NotBlank(message="zipCode cannot be blank")
                         @Pattern(regexp="\\d{6}", message="invalid format for zipCode")
                         String zipCode,

                         @NotBlank(message="city cannot be blank")
                         String city,

                         @NotBlank(message="state cannot be blank")
                         String state,

                         String additionalDetails,

                         String houseNumber) {
}
