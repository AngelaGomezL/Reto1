package com.example.Plazoleta.insfrastructure.output.mapper;

import com.example.Plazoleta.domain.modelo.Plato;
import com.example.Plazoleta.domain.modelo.Restaurante;
import com.example.Plazoleta.insfrastructure.output.entity.PlatoEntity;
import com.example.Plazoleta.insfrastructure.output.entity.RestauranteEntity;
import org.mapstruct.*;

import java.util.Optional;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface IPlatoEntityMapper  {
    @Mappings({
            @Mapping(target="id", source= "plato.id"),
            @Mapping(target="nombre", source="plato.nombre"),
            @Mapping(target="precio", source="plato.precio"),
            @Mapping(target="descripcion", source="plato.descripcion"),
            @Mapping(target="urlImagen", source="plato.urlImagen"),
            @Mapping(target="idRestaurante", source="restaurante"),
            @Mapping(target="idCategoria", source="plato.idCategoria")
    })
    PlatoEntity toEntity(Plato plato, Restaurante restaurante);
    default PlatoEntity mapContext(Plato plato, @Context Restaurante restaurante) {
        return toEntity(plato , restaurante);
    }



}
