package com.mudir.hospitalmanagementapp.domain.dtos.patients;

import com.mudir.hospitalmanagementapp.domain.dtos.AddressDTO;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record PatientDTO(@NotBlank(message = "name cannot be blank")
                           String name,

                          @NotBlank(message = "email cannot be blank")
                           @Email(message = "invalid format for email")
                           String email,

                          @NotBlank(message = "cpf cannot be blank")
                           @Pattern(regexp = "\\d{11}", message = "invalid format for cpf")
                           String cpf,

                          @NotBlank(message = "telephone cannot be blank")
                           String telephone,

                          @NotNull(message = "address cannot be null")
                           @Valid
                          AddressDTO address) {
}
