package com.example.Plazoleta.domain.usecase;

import com.example.Plazoleta.domain.api.IRestauranteServicePort;
import com.example.Plazoleta.domain.modelo.Restaurante;
import com.example.Plazoleta.domain.spi.IRestaurantePersistencePort;

import java.util.List;

public class RestauranteUseCase implements IRestauranteServicePort {

    private final IRestaurantePersistencePort restaurantePersistencePort;

    public RestauranteUseCase(IRestaurantePersistencePort restaurantePersistencePort){
        this.restaurantePersistencePort = restaurantePersistencePort;
    }

    @Override
    public void saveRestaurante(Restaurante restaurante) {
        restaurantePersistencePort.saveRestaurante(restaurante);
    }

    @Override
    public List<Restaurante> findAllRestaurante() {
        return restaurantePersistencePort.getAllRestaurante();
    }

    @Override
    public void getRestaurante(Integer id) {}
}
