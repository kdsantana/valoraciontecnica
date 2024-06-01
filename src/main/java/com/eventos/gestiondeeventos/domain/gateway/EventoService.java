package com.eventos.gestiondeeventos.domain.gateway;

import com.eventos.gestiondeeventos.domain.model.Eventos;

import java.util.List;

public interface EventoService {

    Eventos crearEventos(Eventos eventos);

    void eliminarEventos(String id);

    List<Eventos> listarEventos(Eventos eventos);

    List<Eventos> buscarEventoPorUsuarioRegistrado(String usuarioId);


}
