package com.example.Plazoleta.application.dto.Plato;

import com.example.Plazoleta.insfrastructure.output.entity.RestauranteEntity;

public class PlatoResponse {
    private Long id;
    private String nombre;
    private String idCategoria;
    private String descripcion;
    private String precio;
    private String urlImagen;
    private RestauranteEntity idRestaurante;

}
