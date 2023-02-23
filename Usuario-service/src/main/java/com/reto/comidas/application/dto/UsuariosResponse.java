package com.reto.comidas.application.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Getter
@Setter
public class UsuariosResponse {

    private String nombre;
    private String apellido;
    private Long idRol;

}
