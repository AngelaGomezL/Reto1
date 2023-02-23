package com.example.Plazoleta.insfrastructure.output.mapper;


import com.example.Plazoleta.domain.modelo.Restaurante;
import com.example.Plazoleta.insfrastructure.output.entity.RestauranteEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.ReportingPolicy;

import java.sql.SQLOutput;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)

public interface IRestauranteEntityMapper {

    @Mappings({
            @Mapping(target="id", source="id"),
            @Mapping(target="nombre", source="nombre")
            /*@Mapping(target="direccion", source="direccion"),
            @Mapping(target="idPropietario", source="idPropietario"),
            @Mapping(target="telefono", source="telefono"),
            @Mapping(target="urlLogo", source="urlLogo"),
            @Mapping(target="nit", source="nit")*/
    })

    RestauranteEntity toEntity(Restaurante restaurante);

    Restaurante toRestaurante(RestauranteEntity restauranteEntity);




}
