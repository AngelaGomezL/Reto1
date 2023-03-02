package com.example.Plazoleta.application.dto.Restaurante;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.URL;

import javax.validation.constraints.Pattern;

@Getter
@Setter
public class RestauranteRequest {

    @Pattern(regexp = "^[a-zA-Z\\s]*$")
    private String nombre;
    private String direccion;
    private Integer idPropietario;
    @Pattern(regexp = "^(\\+57)?3\\d{9}$")
    private String telefono;
    @URL(message = "must be a url")
    private String urlLogo;
    @Pattern(regexp = "^[0-9]*$")
    private String nit;

}
