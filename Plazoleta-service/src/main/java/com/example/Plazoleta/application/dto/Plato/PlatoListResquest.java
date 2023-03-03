package com.example.Plazoleta.application.dto.Plato;

import lombok.Getter;

@Getter
public class PlatoListResquest {
    private Integer cantidad;
    private Integer pagina;
    private String sort;
    private Integer idRestaurante;
}
