package com.areandina.arquitectura_Software_Eje2.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ErrorResponseDTO {

    private String status;
    private String errorDescription;

}
