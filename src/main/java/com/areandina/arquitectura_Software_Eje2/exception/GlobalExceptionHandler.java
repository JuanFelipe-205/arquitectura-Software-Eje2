package com.areandina.arquitectura_Software_Eje2.exception;

import com.areandina.arquitectura_Software_Eje2.dto.ResponseDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ResponseDTO> handleAllExceptions(Exception ex) {

        ResponseDTO error = ResponseDTO.builder()
                .status("ERROR")
                .errorDescription(ex.getMessage())
                .build();

        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
    }
}