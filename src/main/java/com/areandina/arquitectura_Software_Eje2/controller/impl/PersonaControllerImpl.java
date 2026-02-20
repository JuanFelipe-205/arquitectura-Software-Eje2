package com.areandina.arquitectura_Software_Eje2.controller.impl;

import com.areandina.arquitectura_Software_Eje2.controller.IPersonaController;
import com.areandina.arquitectura_Software_Eje2.dto.AlumnoDTO;
import com.areandina.arquitectura_Software_Eje2.dto.PersonaDTO;
import com.areandina.arquitectura_Software_Eje2.service.AlumnoService;
import com.areandina.arquitectura_Software_Eje2.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/areandina")
public class PersonaControllerImpl implements IPersonaController {

    @Autowired
    private PersonaService personaService;

    @Autowired
    private AlumnoService alumnoService;

    @Override
    public PersonaDTO obtenerPersona(Long userId) {
        return personaService.buscarPorId(userId);
    }

    @Override
    public AlumnoDTO getDataById(String tipo, Long userId) {
        switch (tipo){
            case "ALUMNO" -> {return alumnoService.buscarAlumnoById(userId);}
            default -> {return null;}
        }
    }
}
