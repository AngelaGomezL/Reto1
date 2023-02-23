package com.example.Plazoleta.domain.modelo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class Restaurante_empleado {
    private Integer idRestaurante;
    private Integer idPersona;
    private String fiel;

}
