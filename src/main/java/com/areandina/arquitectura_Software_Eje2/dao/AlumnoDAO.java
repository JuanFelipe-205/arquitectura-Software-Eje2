package com.areandina.arquitectura_Software_Eje2.dao;

import com.areandina.arquitectura_Software_Eje2.model.Alumno;
import com.areandina.arquitectura_Software_Eje2.model.Persona;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Repository;

@Repository
public class AlumnoDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Autowired
    private Environment env;

    public Alumno buscarPersonaPorId(Long userId) {
        String sql = env.getProperty("sql.alumnos.getAlumnos");

        Query query = entityManager.createNativeQuery(sql, Persona.class);
        query.setParameter("userId", userId);

        return (Alumno) query.getSingleResult();
    }

}
