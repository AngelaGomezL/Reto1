package com.example.Plazoleta.application.mapper.PlatoMapper;
import com.example.Plazoleta.application.dto.Plato.PlatoRequest;
import com.example.Plazoleta.application.dto.Plato.PlatoResponse;
import com.example.Plazoleta.domain.modelo.Plato;
import org.mapstruct.Mapper;

import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface IPlatoResponseMapper {
    PlatoResponse toPlateResponse(Plato plato);
}
