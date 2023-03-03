package com.example.Plazoleta.domain.modelo;

import lombok.*;

@Getter
@Setter
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
public class Plato {
    private Integer id;
    private String nombre;
    private String idCategoria;
    private String descripcion;
    private String precio;
    private Integer idRestaurante;
    private String urlImagen;
    private Boolean activo;

}
