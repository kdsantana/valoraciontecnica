package com.eventos.gestiondeeventos.infraestructure.jparepository.evento;

import com.eventos.gestiondeeventos.domain.model.Eventos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EventoRepository extends JpaRepository<Eventos, String> {

    List<Eventos> buscarListaEventosPorUsuariosRegistrados (String usuarioId);


}
