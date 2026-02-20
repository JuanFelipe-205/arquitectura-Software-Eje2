package com.areandina.arquitectura_Software_Eje2.controller;

import com.areandina.arquitectura_Software_Eje2.dto.PersonaDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/api/personas")
public interface IPersonaController {

    @GetMapping("/{userId}")
    PersonaDTO obtenerPersona(@PathVariable Long userId);

}
