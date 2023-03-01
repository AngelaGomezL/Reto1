package com.example.Plazoleta.application.mapper.PlatoMapper;


import com.example.Plazoleta.application.dto.Plato.PlatoRequest;
import com.example.Plazoleta.domain.modelo.Plato;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface IPlatoRequestMapper {
    @Mappings({
            //@Mapping(target="id", source="id"),
            @Mapping(target="nombre", source="nombre"),
            @Mapping(target="precio", source="precio"),
            @Mapping(target="descripcion", source="descripcion"),
            @Mapping(target="urlImagen", source="urlImagen"),
            @Mapping(target="idRestaurante", source="idRestaurante"),
            @Mapping(target="idCategoria", source="idCategoria")
    })

    Plato toPlato(PlatoRequest platoRequest);




}
