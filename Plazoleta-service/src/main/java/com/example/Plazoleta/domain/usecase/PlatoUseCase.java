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
        System.out.println("loooooooooooooooooooolaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        Integer idRestaurante = plato.getIdRestaurante();
        Restaurante restaurante = restaurantePersistencePort.findById(idRestaurante);
        platoPersistencePort.savePlato(plato,restaurante);
        System.out.println(restaurante.getId());

    }
}
