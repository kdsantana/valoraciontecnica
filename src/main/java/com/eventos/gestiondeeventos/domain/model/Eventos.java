package com.eventos.gestiondeeventos.domain.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "eventos")
public class Eventos {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    private String usuarioId;
    private String nombre;
    private String fecha;
    private String direccion;
}
