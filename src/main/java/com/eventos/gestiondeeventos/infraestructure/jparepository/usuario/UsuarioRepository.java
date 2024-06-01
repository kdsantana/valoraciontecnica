package com.eventos.gestiondeeventos.infraestructure.jparepository.usuario;

import com.eventos.gestiondeeventos.domain.model.Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuarios, String> {
}
