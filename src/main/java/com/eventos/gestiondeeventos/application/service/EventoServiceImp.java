package com.eventos.gestiondeeventos.application.service;

import com.eventos.gestiondeeventos.domain.gateway.EventoService;
import com.eventos.gestiondeeventos.domain.model.Eventos;
import com.eventos.gestiondeeventos.infraestructure.jparepository.evento.EventoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class EventoServiceImp implements EventoService {

    private final EventoRepository eventoRepository;

    @Autowired
    public EventoServiceImp(EventoRepository eventoRepository) {
        this.eventoRepository = eventoRepository;
    }

    @Override
    public Eventos crearEventos(Eventos eventos) {
        return eventoRepository.save(eventos);
    }

    @Override
    public void eliminarEventos(String id) {
        eventoRepository.deleteAllById(Collections.singleton(id));
    }

    @Override
    public List<Eventos> listarEventos(Eventos eventos) {
        return eventoRepository.findAll();
    }

    @Override
    public List<Eventos> buscarEventoPorUsuarioRegistrado(String usuarioId) {
        return eventoRepository.buscarListaEventosPorUsuariosRegistrados(usuarioId);
    }
}
