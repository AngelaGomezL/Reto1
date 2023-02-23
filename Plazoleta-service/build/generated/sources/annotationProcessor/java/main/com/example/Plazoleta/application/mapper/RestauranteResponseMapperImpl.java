package com.example.Plazoleta.application.mapper;

import com.example.Plazoleta.application.dto.request.RestauranteRequest;
import com.example.Plazoleta.domain.modelo.Restaurante;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-02-22T12:22:58-0500",
    comments = "version: 1.5.2.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.6.jar, environment: Java 17.0.6 (Eclipse Adoptium)"
)
@Component
public class RestauranteResponseMapperImpl implements RestauranteResponseMapper {

    @Override
    public Restaurante toRestaurante(RestauranteRequest restauranteRequest) {
        if ( restauranteRequest == null ) {
            return null;
        }

        Restaurante.RestauranteBuilder restaurante = Restaurante.builder();

        restaurante.id( restauranteRequest.getId() );
        restaurante.nombre( restauranteRequest.getNombre() );

        return restaurante.build();
    }
}
