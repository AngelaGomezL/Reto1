package com.example.Plazoleta.application.dto.Restaurante;

import lombok.Getter;

@Getter
public class RestauranteListRequest {

    private Integer cantidad;

    private Integer pagina;

    private String sort;
}
