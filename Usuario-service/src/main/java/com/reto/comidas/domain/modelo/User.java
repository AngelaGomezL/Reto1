package com.reto.comidas.domain.modelo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class User {
    private Integer id;
    private String nombre;
    private String apellido;
    private String celular;
    private String email;
    private String clave;
    private Role role;
    private String documentoIdentidad;


}

