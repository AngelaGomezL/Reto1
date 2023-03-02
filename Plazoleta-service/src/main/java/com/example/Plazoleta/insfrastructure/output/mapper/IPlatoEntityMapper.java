package com.example.Plazoleta.insfrastructure.output.mapper;

import com.example.Plazoleta.domain.modelo.Plato;
import com.example.Plazoleta.insfrastructure.output.entity.PlatoEntity;
import com.example.Plazoleta.insfrastructure.output.entity.RestauranteEntity;
import org.mapstruct.*;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface IPlatoEntityMapper  {
    @Mappings({
            @Mapping(target="id", source= "id"),
            @Mapping(target="nombre", source="nombre"),
            @Mapping(target="precio", source="precio"),
            @Mapping(target="descripcion", source="descripcion"),
            @Mapping(target="urlImagen", source="urlImagen"),
            @Mapping(target="idCategoria", source="idCategoria"),
            @Mapping(target = "activo", source = "activo")
    })
    PlatoEntity toEntity(Plato plato);

    @AfterMapping
    default void setRestauranteId(@MappingTarget PlatoEntity entity, Plato plato){
        entity.setRestaurante(RestauranteEntity.builder().id(plato.getIdRestaurante()).build());
    }



}
