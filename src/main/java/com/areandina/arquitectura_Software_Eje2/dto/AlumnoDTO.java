package com.areandina.arquitectura_Software_Eje2.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Data
public class AlumnoDTO {

    private Long id;
    private String nombre;
    private String apellido;
    private String email;
    private Date fecha_nacimiento;

}
