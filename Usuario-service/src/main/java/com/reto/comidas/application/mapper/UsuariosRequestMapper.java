package com.reto.comidas.application.mapper;

import com.reto.comidas.application.dto.UsuariosRequest;
import com.reto.comidas.domain.modelo.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)

public interface UsuariosRequestMapper {

    @Mappings({
            @Mapping(target="nombre", source="nombre"),
            @Mapping(target="apellido", source="apellido"),
            @Mapping(target="celular", source="celular"),
            @Mapping(target="email", source="email"),
            @Mapping(target="clave", source="clave"),
            @Mapping(target="documentoIdentidad", source="documentoIdentidad")
    })
    User toUsuario(UsuariosRequest usuarioRequest);

}
