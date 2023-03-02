package com.example.Plazoleta.application.mapper.RestauranteMapper;

import com.example.Plazoleta.application.dto.Restaurante.RestauranteRequest;
import com.example.Plazoleta.domain.modelo.Restaurante;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)

public interface RestaurantesRequestMapper {

    @Mappings({
            @Mapping(target="nombre", source="nombre"),
            @Mapping(target="direccion", source="direccion"),
            @Mapping(target="idPropietario", source="idPropietario"),
            @Mapping(target="telefono", source="telefono"),
            @Mapping(target="urlLogo", source="urlLogo"),
            @Mapping(target="nit", source="nit")
    })
    Restaurante toRestaurante(RestauranteRequest restauranteRequest);
}
