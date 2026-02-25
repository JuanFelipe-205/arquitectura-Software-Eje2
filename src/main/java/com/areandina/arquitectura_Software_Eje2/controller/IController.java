package com.areandina.arquitectura_Software_Eje2.controller;

import com.areandina.arquitectura_Software_Eje2.dto.PersonaDTO;
import com.areandina.arquitectura_Software_Eje2.dto.ResponseDTO;
import com.areandina.arquitectura_Software_Eje2.dto.UsuarioDTO;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api/areandina")
public interface IController {

    @GetMapping("/{userId}")
    PersonaDTO obtenerPersona(@PathVariable Long userId);

    @GetMapping("usuario/{id}")
    UsuarioDTO getUsuarioById(@PathVariable Long id);

    @PutMapping("usuario/{id}")
    ResponseDTO updateUsuarioById(@PathVariable Long id, @RequestBody UsuarioDTO usuarioDTO);

    @PostMapping("usuario")
    ResponseDTO crearUsuario(@RequestBody UsuarioDTO usuarioDTO);
}
