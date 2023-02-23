package com.example.Plazoleta.domain.modelo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class Categoria {
    private Integer id;
    private String nombre;
    private String descripcion;

}
