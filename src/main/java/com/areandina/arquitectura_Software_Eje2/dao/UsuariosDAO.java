package com.areandina.arquitectura_Software_Eje2.dao;

import com.areandina.arquitectura_Software_Eje2.dto.UsuarioDTO;
import com.areandina.arquitectura_Software_Eje2.model.Usuarios;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class UsuariosDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Autowired
    private Environment env;

    public Usuarios getUserById (Long id){
        String sqlQuery = env.getProperty("sql.get.usuarios");
        Query query = entityManager.createNativeQuery(sqlQuery, Usuarios.class);
        query.setParameter("id", id);

        return (Usuarios) query.getSingleResult();
    }

    @Transactional
    public int updateUserById (Usuarios usuarios){
        String sqlQuery = env.getProperty("sql.update.usuarios");
        Query query = entityManager.createNativeQuery(sqlQuery, Usuarios.class);
        query.setParameter("id", usuarios.getId());
        query.setParameter("nombre", usuarios.getNombre());
        query.setParameter("apellido", usuarios.getApellido());
        query.setParameter("correo", usuarios.getCorreo());
        query.setParameter("telefono", usuarios.getTelefono());
        query.setParameter("fecha", usuarios.getFecha_nacimiento());

        return query.executeUpdate();
    }

}