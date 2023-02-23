package com.reto.comidas.application.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import java.math.BigInteger;

@Getter
@Setter
public class UsuariosRequest {
    private Integer id;
    private String nombre;
    private String apellido;
    private String celular;
    private String correo;
    private String clave;
    private String idRol;
    private String documentoIdentidad;
}
