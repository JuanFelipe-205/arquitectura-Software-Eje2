package com.areandina.arquitectura_Software_Eje2.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ResponseDTO {

    private String status;
    private String errorDescription;

    public ResponseDTO(String status, String errorDescription) {
        this.status = status;
        this.errorDescription = errorDescription;
    }
}
