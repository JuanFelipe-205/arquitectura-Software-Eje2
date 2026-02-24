package com.areandina.arquitectura_Software_Eje2.dto;

import lombok.Data;

@Data
public class UsuarioDTO {

    private long id;
    private String nombre;
    private String apellido;
    private String correo;
    private String telefono;
    private String fecha_nacimiento;
    private String tipo_usuario;
    private String activo;

}
