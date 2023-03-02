package com.example.Plazoleta.domain.spi;

import com.example.Plazoleta.domain.modelo.Plato;
import com.example.Plazoleta.domain.modelo.Restaurante;

import java.util.List;

public interface IPlatoPersistencePort {
    void savePlato(Plato plato);
    List<Plato> getAllPlatos();
    Plato getPlato(Integer id);
    void updatePlate(Plato plato);


}
