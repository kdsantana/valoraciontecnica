package com.eventos.gestiondeeventos.infraestructure.reactiveweb.entrypoints.eventos;

import com.eventos.gestiondeeventos.domain.gateway.EventoService;
import com.eventos.gestiondeeventos.domain.model.Eventos;
import com.eventos.gestiondeeventos.infraestructure.reactiveweb.response.EventoResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/events/")
public class EventosController {

    @Autowired
    EventoService eventoService;

    @GetMapping
    public ResponseEntity<EventoResponse<List<Eventos>>> listarEventos (Eventos eventos){
        List<Eventos> listaEventos = eventoService.listarEventos(eventos);
        EventoResponse <List<Eventos>> response = new EventoResponse<>(listaEventos);
        return ResponseEntity.ok(response);
    }

    @GetMapping("{id}")
    public ResponseEntity<EventoResponse<Void>> eliminarEventos (@PathVariable String id) {
        eventoService.eliminarEventos(id);
        EventoResponse<Void> response = new EventoResponse<>("elemento", null, null, null);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<EventoResponse<List<Eventos>>> listarEventosPorUsuarioRegistrado(@PathVariable String userId){
        List<Eventos> listaEventos = eventoService.buscarEventoPorUsuarioRegistrado(userId);
        EventoResponse <List<Eventos>> response = new EventoResponse<>(listaEventos);
        return ResponseEntity.ok(response);
    }

    @PostMapping("{id}/register")
    public ResponseEntity<EventoResponse<Eventos>> crearEvento (@RequestBody Eventos eventos) {
        Eventos nuevoEvento = eventoService.crearEventos(eventos);
        EventoResponse <Eventos> response = new EventoResponse<>(nuevoEvento.getId(), nuevoEvento.getNombre(), nuevoEvento.getFecha(), nuevoEvento.getDireccion());
        return ResponseEntity.ok(response);
    }
}
