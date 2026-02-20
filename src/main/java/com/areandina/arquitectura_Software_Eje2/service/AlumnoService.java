package com.areandina.arquitectura_Software_Eje2.service;

import com.areandina.arquitectura_Software_Eje2.dao.AlumnoDAO;
import com.areandina.arquitectura_Software_Eje2.dto.AlumnoDTO;
import com.areandina.arquitectura_Software_Eje2.model.Alumno;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlumnoService {

    @Autowired
    private AlumnoDAO alumnoDAO;

    public AlumnoDTO buscarAlumnoById(Long userId){
        try {
            Alumno persona = alumnoDAO.buscarPersonaPorId(userId);
            AlumnoDTO dto = new AlumnoDTO();

            dto.setId(persona.getId());
            dto.setNombre(persona.getNombre());
            dto.setApellido(persona.getApellido());
            dto.setEmail(persona.getEmail());
            dto.setFecha_nacimiento(persona.getFecha_nacimiento());

            return dto;

        }catch (Exception e) {
            throw new RuntimeException("La persona con ID " + userId + " no existe en la base de datos.");
        }
    }

}
