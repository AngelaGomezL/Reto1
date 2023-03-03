package com.example.Plazoleta.domain.spi;

import com.example.Plazoleta.application.dto.Plato.PlatoListResquest;
import com.example.Plazoleta.domain.modelo.Plato;

import java.util.List;

public interface IPlatoPersistencePort {
    void savePlato(Plato plato);
    List<Plato> getAllPlatos();
    Plato getPlato(Integer id);
    void updatePlate(Plato plato);
    Plato findById(Integer id);
    List<Plato> findAllByIdRestaurante(PlatoListResquest pagination);


}
