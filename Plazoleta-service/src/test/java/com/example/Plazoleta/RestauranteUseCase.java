package com.example.Plazoleta;

import com.example.Plazoleta.application.dto.Restaurante.RestauranteListRequest;
import com.example.Plazoleta.domain.modelo.Plato;
import com.example.Plazoleta.domain.modelo.Restaurante;
import com.example.Plazoleta.domain.spi.IRestaurantePersistencePort;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
@SpringBootTest
public class RestauranteUseCase {

    @InjectMocks
    RestauranteUseCase restauranteUseCase;
    @Mock
    IRestaurantePersistencePort restaurantePersistencePort;
    @Test
    void saveRestaurante(){
        Restaurante restaurante = new Restaurante();
        Assertions.assertDoesNotThrow(() -> restauranteUseCase.saveRestaurante(restaurante));
    }
    @Test
    void findAll() {
    }
    @Test
    void getRestaurante() {
    }





}
