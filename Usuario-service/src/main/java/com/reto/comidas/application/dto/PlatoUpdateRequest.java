package com.reto.comidas.application.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Getter
@Setter
public class PlatoUpdateRequest {
    @NotNull
    private Integer id;
    private String idCategoria;
    @Pattern(regexp = "^[0-9]*$", message = "The price field should be numeric")
    private String precio;

}
