package com.example.Plazoleta.domain.spi;

import com.example.Plazoleta.domain.modelo.Plato;
import com.example.Plazoleta.domain.modelo.Restaurante;

import java.util.List;

public interface IRestaurantePersistencePort {
    void saveRestaurante(Restaurante restaurante);
    List<Restaurante> getAllRestaurante();
    Restaurante findById(Integer id);
}

