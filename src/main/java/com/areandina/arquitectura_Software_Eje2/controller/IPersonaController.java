package com.areandina.arquitectura_Software_Eje2.controller;

import com.areandina.arquitectura_Software_Eje2.dto.AlumnoDTO;
import com.areandina.arquitectura_Software_Eje2.dto.PersonaDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/api/areandina")
public interface IPersonaController {

    @GetMapping("/{userId}")
    PersonaDTO obtenerPersona(@PathVariable Long userId);

    @GetMapping("/{userId}")
    AlumnoDTO getDataById(@RequestParam(name = "tipoUsuario") String tipo, @PathVariable Long userId);

}
