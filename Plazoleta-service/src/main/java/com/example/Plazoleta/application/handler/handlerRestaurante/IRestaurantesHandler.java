package com.example.Plazoleta.application.handler.handlerRestaurante;

import com.example.Plazoleta.application.dto.Restaurante.RestauranteListRequest;
import com.example.Plazoleta.application.dto.Restaurante.RestauranteRequest;
import com.example.Plazoleta.application.dto.Restaurante.RestauranteResponse;
import com.example.Plazoleta.domain.modelo.Restaurante;

import java.util.List;

public interface IRestaurantesHandler {

    void saveRestaurante(RestauranteRequest restauranteRequest);

    List<Restaurante> findAll(RestauranteListRequest pagination);

}
