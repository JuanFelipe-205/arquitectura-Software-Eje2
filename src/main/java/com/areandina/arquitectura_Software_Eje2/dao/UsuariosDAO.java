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

    public int insertUsuario(Usuarios entity) {

        String sql = env.getProperty("sql.usuario.insert");

        Query query = entityManager.createNativeQuery(sql);

        query.setParameter("nombre", entity.getNombre());
        query.setParameter("apellido", entity.getApellido());
        query.setParameter("correo", entity.getCorreo());
        query.setParameter("telefono", entity.getTelefono());
        query.setParameter("fecha_nacimiento", entity.getFecha_nacimiento());
        query.setParameter("tipo_usuario", entity.getTipo_usuario());
        query.setParameter("activo", entity.getActivo());

        return query.executeUpdate();
    }
    public boolean existeCorreo(String correo) {
        String jpql = "SELECT COUNT(u) FROM Usuarios u WHERE u.correo = :correo";
        Long count = entityManager.createQuery(jpql, Long.class)
                .setParameter("correo", correo)
                .getSingleResult();

        return count > 0;
    }

}