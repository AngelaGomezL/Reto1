package com.example.Plazoleta.domain.api;

import com.example.Plazoleta.domain.modelo.Restaurante;

import java.util.List;

public interface IRestauranteServicePort {
    void saveRestaurante(Restaurante restaurante);
    List<Restaurante> getAllRestaurante();
    void getRestaurante(Integer id);
}
