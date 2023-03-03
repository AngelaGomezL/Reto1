package com.reto.comidas.application.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Getter
@Setter
public class PlatoRequest {
    @NotBlank
    private Integer id;
    @NotBlank
    private String nombre;
    @NotBlank
    private String idCategoria;
    @NotBlank
    private String descripcion;

    private Integer idRestaurante;
    @NotBlank
    @Pattern(regexp = "^[0-9]*$", message = "The price field should be numeric")
    private String precio;
    @NotBlank
    private String urlImagen;

    private Boolean activo = true;
}
