package com.areandina.arquitectura_Software_Eje2.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "PERSONAS")
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String apellido;
    private String correo;

}
