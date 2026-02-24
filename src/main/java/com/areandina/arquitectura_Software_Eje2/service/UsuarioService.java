package com.areandina.arquitectura_Software_Eje2.service;

import com.areandina.arquitectura_Software_Eje2.dao.UsuariosDAO;
import com.areandina.arquitectura_Software_Eje2.dto.ResponseDTO;
import com.areandina.arquitectura_Software_Eje2.dto.UsuarioDTO;
import com.areandina.arquitectura_Software_Eje2.model.Usuarios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class UsuarioService {

    @Autowired
    private UsuariosDAO usuariosDAO;

    public UsuarioDTO getUsuarioById(Long id) {
        log.info("Inicnado busqueda de usuario con el Id: {}", id);

        try {
            Usuarios dataOracle = usuariosDAO.getUserById(id);
            log.info("Datos recuperados de Oracle para el ID {}: {}", id, dataOracle);

            UsuarioDTO usuarioDTO = new UsuarioDTO();
            usuarioDTO.setId(dataOracle.getId());
            usuarioDTO.setNombre(dataOracle.getNombre());
            usuarioDTO.setApellido(dataOracle.getApellido());
            usuarioDTO.setCorreo(dataOracle.getCorreo());
            usuarioDTO.setTelefono(dataOracle.getTelefono());
            usuarioDTO.setFecha_nacimiento(dataOracle.getFecha_nacimiento());
            usuarioDTO.setTipo_usuario(dataOracle.getTipo_usuario());
            usuarioDTO.setActivo(dataOracle.getActivo());
            return usuarioDTO;

        } catch (Exception e) {
            log.error("Error crítico al obtener usuario con ID {}: {}", id, e.getMessage());
            e.printStackTrace();

            throw new RuntimeException("El usuario con el ID " + id + " no se ha resgitrado en la BD.");
        }
    }

    public ResponseDTO updateUsuarioById(Long id, UsuarioDTO usuarioDTO){

        Usuarios entity = new Usuarios();
        entity.setId(id);
        entity.setNombre(usuarioDTO.getNombre());
        entity.setApellido(usuarioDTO.getApellido());
        entity.setTelefono(usuarioDTO.getTelefono());
        entity.setCorreo(usuarioDTO.getCorreo());
        entity.setFecha_nacimiento(usuarioDTO.getFecha_nacimiento());

        int statusUpdate = usuariosDAO.updateUserById(entity);

        if (statusUpdate == 1){
            return new ResponseDTO("OK", "Proceso finalizado con exito !");

        }else {
            return new ResponseDTO("ERROR", "No existe el usuario" + id + " en la BD");

        }
    }
}
