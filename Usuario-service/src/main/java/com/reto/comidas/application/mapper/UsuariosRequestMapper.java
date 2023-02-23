package com.reto.comidas.application.mapper;

import com.reto.comidas.application.dto.UsuariosRequest;
import com.reto.comidas.application.dto.UsuariosResponse;
import com.reto.comidas.domain.modelo.Usuario;
import com.reto.comidas.infrastruture.output.entity.UsuarioEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)

public interface UsuariosRequestMapper {

    @Mappings({
            @Mapping(target="id", source="id"),
            @Mapping(target="nombre", source="nombre"),
            @Mapping(target="apellido", source="apellido"),
            @Mapping(target="celular", source="celular"),
            @Mapping(target="correo", source="correo"),
            @Mapping(target="clave", source="clave"),
            @Mapping(target="idRol", source="idRol"),
            @Mapping(target="documentoIdentidad", source="documentoIdentidad")
    })

    Usuario toUsuario(UsuariosRequest usuarioRequest);

}
