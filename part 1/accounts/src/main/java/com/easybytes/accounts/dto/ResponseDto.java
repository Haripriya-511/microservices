package com.easybytes.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;

@Schema(
        description = "Schema to hold successful response info",
        name = "Response"
)
@Data
@AllArgsConstructor
public class ResponseDto {
    @Schema(
            description = "status code in the response"

    )
    private String statusCode;
    @Schema(
            description = "Status message in the response"
    )
    private String statusMsg;
}
