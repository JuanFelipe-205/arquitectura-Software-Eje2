package com.areandina.arquitectura_Software_Eje2.controller.impl;

import com.areandina.arquitectura_Software_Eje2.controller.IPersonaController;
import com.areandina.arquitectura_Software_Eje2.dto.PersonaDTO;
import com.areandina.arquitectura_Software_Eje2.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/personas")
public class PersonaControllerImpl implements IPersonaController {

    @Autowired
    private PersonaService personaService;

    @Override
    public PersonaDTO obtenerPersona(Long userId) {
        return personaService.buscarPorId(userId);
    }
}
