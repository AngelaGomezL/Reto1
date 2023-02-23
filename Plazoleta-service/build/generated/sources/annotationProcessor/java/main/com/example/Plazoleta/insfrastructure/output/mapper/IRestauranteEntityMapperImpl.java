package com.example.Plazoleta.insfrastructure.output.mapper;

import com.example.Plazoleta.domain.modelo.Restaurante;
import com.example.Plazoleta.insfrastructure.output.entity.RestauranteEntity;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-02-22T12:22:58-0500",
    comments = "version: 1.5.2.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.6.jar, environment: Java 17.0.6 (Eclipse Adoptium)"
)
@Component
public class IRestauranteEntityMapperImpl implements IRestauranteEntityMapper {

    @Override
    public RestauranteEntity toEntity(Restaurante restaurante) {
        if ( restaurante == null ) {
            return null;
        }

        RestauranteEntity restauranteEntity = new RestauranteEntity();

        restauranteEntity.setId( restaurante.getId() );
        restauranteEntity.setNombre( restaurante.getNombre() );

        return restauranteEntity;
    }

    @Override
    public Restaurante toRestaurante(RestauranteEntity restauranteEntity) {
        if ( restauranteEntity == null ) {
            return null;
        }

        Restaurante.RestauranteBuilder restaurante = Restaurante.builder();

        restaurante.id( restauranteEntity.getId() );
        restaurante.nombre( restauranteEntity.getNombre() );

        return restaurante.build();
    }
}
