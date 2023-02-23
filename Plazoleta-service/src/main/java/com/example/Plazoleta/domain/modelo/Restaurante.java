package com.example.Plazoleta.domain.modelo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;


@Getter
@Setter
@Builder
@AllArgsConstructor
public class Restaurante {
    private Integer id;
    private String nombre;


    /*private String direccion;
    private Integer idPropietario;
    private String telefono;
    private String urlLogo;
    private String nit;*/

}
