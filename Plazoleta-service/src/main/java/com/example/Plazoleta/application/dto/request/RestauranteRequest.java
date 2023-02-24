package com.example.Plazoleta.application.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Getter
@Setter
public class RestauranteRequest {

    private Integer id;
    private String nombre;
    private String direccion;
    private Integer idPropietario;
    private String telefono;
    private String urlLogo;
    private String nit;
}
