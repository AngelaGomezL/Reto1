package com.example.Plazoleta.application.mapper.RestauranteMapper;


import com.example.Plazoleta.application.dto.Restaurante.RestauranteRequest;
import com.example.Plazoleta.domain.modelo.Restaurante;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)

public interface RestauranteResponseMapper {

    Restaurante toRestaurante(RestauranteRequest restauranteRequest);


}
