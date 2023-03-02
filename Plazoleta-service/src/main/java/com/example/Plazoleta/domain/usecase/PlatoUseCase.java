package com.example.Plazoleta.domain.usecase;

import com.example.Plazoleta.domain.api.IPlatoServicePort;
import com.example.Plazoleta.domain.modelo.Plato;
import com.example.Plazoleta.domain.modelo.Restaurante;
import com.example.Plazoleta.domain.spi.IPlatoPersistencePort;
import com.example.Plazoleta.domain.spi.IRestaurantePersistencePort;
import com.example.Plazoleta.insfrastructure.output.entity.RestauranteEntity;

public class PlatoUseCase implements IPlatoServicePort {

    private final IRestaurantePersistencePort restaurantePersistencePort;
    private final IPlatoPersistencePort platoPersistencePort;

    public PlatoUseCase(IRestaurantePersistencePort restaurantePersistencePort, IPlatoPersistencePort platoPersistencePort) {
        this.restaurantePersistencePort = restaurantePersistencePort;
        this.platoPersistencePort = platoPersistencePort;
    }


    @Override
    public void savePlato(Plato plato) {
        platoPersistencePort.savePlato(plato);
    }

    @Override
    public Plato findById(Integer id) {
        return platoPersistencePort.findById(id);
    }
}
