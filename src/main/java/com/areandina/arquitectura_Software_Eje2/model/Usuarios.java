package com.areandina.arquitectura_Software_Eje2.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "usuarios")
public class Usuarios {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nombre;
    private String apellido;
    private String correo;
    private String telefono;
    private String fecha_nacimiento;
    private String tipo_usuario;
    private String activo;

}
