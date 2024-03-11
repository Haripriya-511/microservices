package com.easybytes.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Schema(
        description = "Schema to hold Account info",
     name = "Accounts"
)
@Data
public class AccountsDto {

    @NotEmpty(message = "Account Number cannot be null or empty")
    @Pattern(regexp ="(^$|[0-9]{10})",message = "Account number must be 10 digits")
    @Schema(
            description = "Account Number of bank account",
            example = "3456127895"

    )
    private Long accountNumber;
    @NotEmpty(message = "AccountType cannot be a null or empty")
    @Schema(
            description = "Account type of eazybank account",

            example = "Savings"
    )
    private String accountType;
    @NotEmpty(message = "BranchAddress cannot be a null or empty")
    @Schema(
            description = "Branch adress of bank",
            example = "123 New York"

    )
    private String branchAddress;
}
