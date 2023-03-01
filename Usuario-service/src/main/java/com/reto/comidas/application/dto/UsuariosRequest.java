package com.reto.comidas.application.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Getter
@Setter
public class UsuariosRequest {

    //@NotBlank(message = "El campo id es obligatorio")
    //private Integer id;
    @NotBlank
    private String nombre;
    @NotBlank(message = "El campo apellido es obligatorio")
    private String apellido;
    @Pattern(regexp = "^(\\+57)?3\\d{9}$", message = "Debe ingresar un numero de telefono valido")
    private String celular;
    @NotBlank
    @Email
    private String email;
    @NotBlank
    private String clave;
    @NotBlank(message = "Falta campo documento")
    @Pattern(regexp = "^[0-9]*$")
    @Size(min = 5, max=11, message = "tamaño no permitido para el documento de identificación")
    private String documentoIdentidad;


}
