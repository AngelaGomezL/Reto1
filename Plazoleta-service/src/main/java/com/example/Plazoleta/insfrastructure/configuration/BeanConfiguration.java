package com.example.Plazoleta.insfrastructure.configuration;

import com.example.Plazoleta.domain.api.IRestauranteServicePort;
import com.example.Plazoleta.domain.spi.IRestaurantePersistencePort;
import com.example.Plazoleta.domain.usecase.RestauranteUseCase;
import com.example.Plazoleta.insfrastructure.output.adapter.RestauranteJpaAdapter;
import com.example.Plazoleta.insfrastructure.output.mapper.IRestauranteEntityMapper;
import com.example.Plazoleta.insfrastructure.output.repository.IRestauranteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class BeanConfiguration {

    private final IRestauranteRepository restauranteRepository;
    private final IRestauranteEntityMapper restauranteEntityMapper;

    @Bean
    public IRestaurantePersistencePort restaurantePersistencePort(){
        return new RestauranteJpaAdapter(restauranteRepository, restauranteEntityMapper);
    }
    @Bean
    public IRestauranteServicePort restauranteServicePort(){
        return new RestauranteUseCase(restaurantePersistencePort());
    }


}
