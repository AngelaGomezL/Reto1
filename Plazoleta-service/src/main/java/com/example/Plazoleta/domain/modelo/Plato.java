package com.example.Plazoleta.domain.modelo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class Plato {
    private Integer id;
    private String nombre;
    private String idCategoria;
    private String descripcion;
    private String precio;
    private String idRestaurante;
    private String urlImagen;
    private String activo;
}
