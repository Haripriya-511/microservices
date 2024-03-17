package com.easybytes.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Schema(
        name="Customer",
        description = "Schema to hold Customer And Account info"
)
public class CustomerDto {
    @Schema(
            description = "Name of the customer",
            example = "priya"
    )
    @NotEmpty(message = "Name cannot be null or Empty")
    @Size(min=5,max=30,message = "The length of customer name should between 5 and 30")
    private String name;

    @Schema(
            description = "Email of the customer",
            example = "kp@gmail.com"
    )
    @NotEmpty(message = "Email cannot be null or Empty")
    @Email(message = "Email address should be valid value")
    private String email;

    @Schema(
            description = "mobileNumber of the customer",
            example = "123456789"
    )
    @Pattern(regexp ="(^$|[0-9]{10})",message = "Mobile number must be 10 digits")
    private String mobileNumber;

    @Schema(
            description = "Account Details of customer"
    )
    private AccountsDto accountsDto;
}
