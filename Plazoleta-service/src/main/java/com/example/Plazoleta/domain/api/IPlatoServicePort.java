package com.example.Plazoleta.domain.api;

import com.example.Plazoleta.application.dto.Plato.PlatoListResquest;
import com.example.Plazoleta.domain.modelo.Plato;

import java.util.List;

public interface IPlatoServicePort {
    void savePlato(Plato plato);
    Plato findById(Integer id);
    List<Plato> findAllByIdRestaurante(PlatoListResquest pagination);
}
