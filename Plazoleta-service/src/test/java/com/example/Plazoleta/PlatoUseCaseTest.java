package com.example.Plazoleta;

import com.example.Plazoleta.application.dto.Plato.PlatoListResquest;
import com.example.Plazoleta.domain.modelo.Plato;
import com.example.Plazoleta.domain.spi.IPlatoPersistencePort;
import com.example.Plazoleta.domain.spi.IRestaurantePersistencePort;
import com.example.Plazoleta.domain.usecase.PlatoUseCase;
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
public class PlatoUseCaseTest {
    @InjectMocks
    PlatoUseCase platoUseCase;
    @Mock
    IRestaurantePersistencePort restaurantePersistencePort;
    @Mock
    IPlatoPersistencePort platoPersistencePort;
    @Test
    void savePlato() {
        Plato plato = new Plato();
        Assertions.assertDoesNotThrow(() -> platoUseCase.savePlato(plato));
    }

    @Test
    void findByIdTest(){
        Mockito.when(platoPersistencePort.findById(Mockito.any())).thenReturn(new Plato());
        var result = platoUseCase.findById(1);
        Assertions.assertNotNull(result);
    }
    @Test
    void findAllByIdRestaurante() {
    }


}
