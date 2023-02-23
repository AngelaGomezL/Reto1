package com.example.Plazoleta.insfrastructure.output.adapter;

import com.example.Plazoleta.domain.modelo.Restaurante;
import com.example.Plazoleta.domain.spi.IRestaurantePersistencePort;
import com.example.Plazoleta.insfrastructure.output.entity.RestauranteEntity;
import com.example.Plazoleta.insfrastructure.output.mapper.IRestauranteEntityMapper;
import com.example.Plazoleta.insfrastructure.output.repository.IRestauranteRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;
@RequiredArgsConstructor
public class RestauranteJpaAdapter implements IRestaurantePersistencePort {

    private final IRestauranteRepository restauranteRepository;

    private final IRestauranteEntityMapper restauranteEntityMapper;

    public void saveRestaurante(Restaurante restaurante) {
        System.out.println(restaurante);
        restauranteRepository.save(restauranteEntityMapper.toEntity(restaurante));
    }

    @Override
    public List<Restaurante> getAllRestaurante() {
        return null;
    }

}
