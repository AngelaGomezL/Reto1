package com.example.Plazoleta.application.handler.handlerRestaurante;

import com.example.Plazoleta.application.dto.Restaurante.RestauranteRequest;
import com.example.Plazoleta.application.dto.Restaurante.RestauranteResponse;

import java.util.List;

public interface IRestaurantesHandler {

    void saveRestaurante(RestauranteRequest restauranteRequest);

    List<RestauranteResponse> findAllRestauranteFromRestaurantes();

}
