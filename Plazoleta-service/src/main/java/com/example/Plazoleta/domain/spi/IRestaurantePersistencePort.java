package com.example.Plazoleta.domain.spi;

import com.example.Plazoleta.application.dto.Restaurante.RestauranteListRequest;
import com.example.Plazoleta.domain.modelo.Restaurante;

import java.util.List;

public interface IRestaurantePersistencePort {
    void saveRestaurante(Restaurante restaurante);
    List<Restaurante> findAll(RestauranteListRequest pagination);
    Restaurante findById(Integer id);
}

