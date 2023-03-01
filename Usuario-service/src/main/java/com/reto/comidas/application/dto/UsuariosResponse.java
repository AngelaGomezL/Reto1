package com.reto.comidas.application.dto;

import lombok.Getter;
import lombok.Setter;
import org.apache.catalina.Role;

@Getter
@Setter
public class UsuariosResponse {

    private String nombre;
    private String apellido;
    private String celular;
    private String email;
    private Role role;
    private String documentoIdentidad;




}
