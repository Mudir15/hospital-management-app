package com.mudir.hospitalmanagementapp.domain.entities;

import com.mudir.hospitalmanagementapp.domain.dtos.AddressDTO;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

/**
 *
 * @author Mudir Taak
 * @version 1.0
 */
@Embeddable
public class Address {

    public Address() {

    }

    /**
     * Constructor for class Address
     * @param addressDTO  Data transfer object containing Address information
     * @see AddressDTO
     */
    public Address(AddressDTO addressDTO) {
        this.AddressLine = addressDTO.AddressLine();
        this.zipCode = addressDTO.zipCode();
        this.city = addressDTO.city();
        this.state = addressDTO.state();
        this.additionalDetails = addressDTO.additionalDetails();
        this.houseNumber = addressDTO.houseNumber();
    }

    @NotBlank(message="AddressLine cannot be blank")
    @Column(name="AddressLine")
    private String AddressLine;

    @NotBlank(message="zipCode cannot be blank")
    @Pattern(regexp="\\d{6}", message="invalid format for zipCode")
    @Column(name="zip_code")
    private String zipCode;

    public void setAddressLine(String addressLine) {
        AddressLine = addressLine;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setAdditionalDetails(String additionalDetails) {
        this.additionalDetails = additionalDetails;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    @NotBlank(message="city cannot be blank")
    @Column(name="city")
    private String city;

    @NotBlank(message="state cannot be blank")
    @Column(name="state")
    private String state;

    @Column(name="additional_details")
    private String additionalDetails;

    @Column(name="house_number")
    private String houseNumber;

    public String getAddressLine() {
        return AddressLine;
    }

    public String getZipCode() {
        return zipCode;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getAdditionalDetails() {
        return additionalDetails;
    }

    public String getHouseNumber() {
        return houseNumber;
    }
}