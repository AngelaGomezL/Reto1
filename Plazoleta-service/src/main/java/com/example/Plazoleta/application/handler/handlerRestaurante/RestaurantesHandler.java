package com.example.Plazoleta.application.handler.handlerRestaurante;

import com.example.Plazoleta.application.dto.Restaurante.RestauranteRequest;
import com.example.Plazoleta.application.dto.Restaurante.RestauranteResponse;
import com.example.Plazoleta.application.mapper.RestauranteMapper.RestauranteResponseMapper;
import com.example.Plazoleta.application.mapper.RestauranteMapper.RestaurantesRequestMapper;
import com.example.Plazoleta.domain.api.IRestauranteServicePort;
import com.example.Plazoleta.domain.modelo.Restaurante;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@RequiredArgsConstructor
@Transactional
public class RestaurantesHandler implements IRestaurantesHandler {

    private final IRestauranteServicePort restauranteServicePort;
    private final RestaurantesRequestMapper restaurantesRequestMapper;

    private final RestauranteResponseMapper restauranteResponseMapper;


    @Override
    public void saveRestaurante(RestauranteRequest restauranteRequest) {
        Restaurante restaurante = restaurantesRequestMapper.toRestaurante(restauranteRequest);
        restauranteServicePort.saveRestaurante(restaurante);
    }

    @Override
    public List<RestauranteResponse> getAllRestauranteFromRestaurantes() {
        return null;
    }
}
