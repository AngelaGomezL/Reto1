package com.reto.comidas.application.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)


public interface UsuariosResponseMapper {
   /* @Mappings({
            @Mapping(target="nombre", source="nombre"),
            @Mapping(target="apellido", source="apellido"),
            @Mapping(target="celular", source="celular"),
            @Mapping(target="correo", source="correo"),
            @Mapping(target="role", source="role")

    })
    UsuariosResponse toUsuarioResponse(Usuario usuario);
    List<UsuariosResponse> toUsuarioResponse(List<Usuario> user);

*/
}
