package com.example.Plazoleta.domain.modelo;

import com.example.Plazoleta.insfrastructure.output.entity.PlatoEntity;
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
    private Integer idRestaurante;
    private String urlImagen;

}
