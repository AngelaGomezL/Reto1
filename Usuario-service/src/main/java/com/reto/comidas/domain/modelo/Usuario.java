package com.reto.comidas.domain.modelo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;


import java.math.BigInteger;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class Usuario {
    private Integer id;
    private String nombre;
    private String apellido;
    private String celular;
    private String correo;
    private String clave;
    private String idRol;
    private String documentoIdentidad;


}

