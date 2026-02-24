package com.areandina.arquitectura_Software_Eje2.service;

import com.areandina.arquitectura_Software_Eje2.dto.PersonaDTO;
import com.areandina.arquitectura_Software_Eje2.model.Persona;
import com.areandina.arquitectura_Software_Eje2.dao.PersonaDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService {

    @Autowired
    private PersonaDAO personaDAO;

    public PersonaDTO buscarPorId(Long userId){
        try {
            Persona persona = personaDAO.buscarPersonaManual(userId);
            PersonaDTO dto = new PersonaDTO();
            dto.setNombre(persona.getNombre());
            dto.setApellido(persona.getApellido());
            dto.setCorreo(persona.getCorreo());

            return dto;

        } catch (Exception e) {
            throw new RuntimeException("La persona con ID " + userId + " no existe en nuestra base de datos.");
        }
    }
}
