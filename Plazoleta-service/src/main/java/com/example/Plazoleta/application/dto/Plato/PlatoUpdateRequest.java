package com.example.Plazoleta.application.dto.Plato;

import lombok.AllArgsConstructor;
import lombok.Getter;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Getter
@AllArgsConstructor
public class PlatoUpdateRequest  {

    @NotNull
    private Integer id;
    private String idCategoria;
    @Pattern(regexp = "^[0-9]*$", message = "The price field should be numeric")
    private String precio;

}
