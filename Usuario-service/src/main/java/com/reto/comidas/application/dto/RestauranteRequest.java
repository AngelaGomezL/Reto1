package com.reto.comidas.application.dto;

import lombok.Getter;
import lombok.Setter;

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
