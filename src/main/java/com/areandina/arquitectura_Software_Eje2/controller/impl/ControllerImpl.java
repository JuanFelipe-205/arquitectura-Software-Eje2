package com.areandina.arquitectura_Software_Eje2.controller.impl;

import com.areandina.arquitectura_Software_Eje2.controller.IController;
import com.areandina.arquitectura_Software_Eje2.dto.PersonaDTO;
import com.areandina.arquitectura_Software_Eje2.dto.ResponseDTO;
import com.areandina.arquitectura_Software_Eje2.dto.UsuarioDTO;
import com.areandina.arquitectura_Software_Eje2.service.PersonaService;
import com.areandina.arquitectura_Software_Eje2.service.UsuarioService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/areandina")
public class ControllerImpl implements IController {

    private final PersonaService personaService;
    private final UsuarioService usuarioService;

    public ControllerImpl(PersonaService personaService, UsuarioService usuarioService) {
        this.personaService = personaService;
        this.usuarioService = usuarioService;
    }

    @Override
    public PersonaDTO obtenerPersona(Long userId) {
        return personaService.buscarPorId(userId);
    }

    @Override
    public UsuarioDTO getUsuarioById(Long id) {
        return usuarioService.getUsuarioById(id);
    }

    @Override
    public ResponseDTO updateUsuarioById(Long id, UsuarioDTO usuarioDTO) {
        return usuarioService.updateUsuarioById(id, usuarioDTO);
    }

    @Override
    public ResponseDTO crearUsuario(UsuarioDTO usuarioDTO) {
        return usuarioService.crearUsuario(usuarioDTO);
    }
}

