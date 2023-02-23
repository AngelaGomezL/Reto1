package com.example.Plazoleta.application.handler;

import com.example.Plazoleta.application.dto.request.RestauranteRequest;
import com.example.Plazoleta.application.dto.response.RestauranteResponse;
import com.example.Plazoleta.application.mapper.RestauranteResponseMapper;
import com.example.Plazoleta.application.mapper.RestaurantesRequestMapper;
import com.example.Plazoleta.domain.api.IRestauranteServicePort;
import com.example.Plazoleta.domain.modelo.Restaurante;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import javax.annotation.PostConstruct;

import java.util.List;
@Service
@RequiredArgsConstructor
@Transactional
public class RestaurantesHandler implements IRestaurantesHandler{

    private final IRestauranteServicePort restauranteServicePort;
    private final RestaurantesRequestMapper restaurantesRequestMapper;

    private final RestauranteResponseMapper restauranteResponseMapper;


    @Override
    public void saveRestaurante(RestauranteRequest restauranteRequest) {
        Restaurante restaurante = restaurantesRequestMapper.toRestaurante(restauranteRequest);
        restauranteServicePort.saveRestaurante(restaurante);
    }
    @PostConstruct
    public void Prueba(){
        System.out.println("Hola mundooooooooooooooooooooooooooooooooooo alexanderrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrr");
    }

    @Override
    public List<RestauranteResponse> getAllRestauranteFromRestaurantes() {
        return null;
    }
}
