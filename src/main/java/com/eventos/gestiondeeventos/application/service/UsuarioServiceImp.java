package com.eventos.gestiondeeventos.application.service;

import com.eventos.gestiondeeventos.domain.gateway.UsuarioService;
import com.eventos.gestiondeeventos.domain.model.Usuarios;
import com.eventos.gestiondeeventos.infraestructure.jparepository.usuario.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServiceImp implements UsuarioService {

    private final UsuarioRepository usuarioRepository;

    @Autowired
    public UsuarioServiceImp(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @Override
    public Usuarios registroDeUsuarios(Usuarios usuarios) {
        return usuarioRepository.save(usuarios);
    }
}
