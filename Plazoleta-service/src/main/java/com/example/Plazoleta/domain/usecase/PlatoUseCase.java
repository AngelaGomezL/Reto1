package com.example.Plazoleta.domain.usecase;

import com.example.Plazoleta.application.dto.Plato.PlatoListResquest;
import com.example.Plazoleta.domain.api.IPlatoServicePort;
import com.example.Plazoleta.domain.modelo.Plato;
import com.example.Plazoleta.domain.spi.IPlatoPersistencePort;
import com.example.Plazoleta.domain.spi.IRestaurantePersistencePort;
import lombok.RequiredArgsConstructor;

import java.util.List;
@RequiredArgsConstructor
public class PlatoUseCase implements IPlatoServicePort {

    private final IRestaurantePersistencePort restaurantePersistencePort;
    private final IPlatoPersistencePort platoPersistencePort;




    @Override
    public void savePlato(Plato plato) {
        platoPersistencePort.savePlato(plato);
    }

    @Override
    public Plato findById(Integer id) {
        return platoPersistencePort.findById(id);
    }

    @Override
    public List<Plato> findAllByIdRestaurante(PlatoListResquest pagination) {
        return platoPersistencePort.findAllByIdRestaurante(pagination);
    }

}
