package com.example.Plazoleta.application.handler;

import com.example.Plazoleta.application.dto.request.RestauranteRequest;
import com.example.Plazoleta.application.dto.response.RestauranteResponse;

import java.util.List;

public interface IRestaurantesHandler {

    void saveRestaurante(RestauranteRequest restauranteRequest);

    List<RestauranteResponse> getAllRestauranteFromRestaurantes();

}
