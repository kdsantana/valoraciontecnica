package com.eventos.gestiondeeventos.infraestructure.reactiveweb.response;

import com.eventos.gestiondeeventos.domain.model.Eventos;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EventoResponse<T>{

    private String id;
    private String name;
    private String date;
    private String location;

    public EventoResponse(List<Eventos> listaEventos) {
    }
}
