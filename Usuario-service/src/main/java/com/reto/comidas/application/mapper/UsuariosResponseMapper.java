package com.reto.comidas.application.mapper;

import com.reto.comidas.application.dto.UsuariosRequest;
import com.reto.comidas.application.dto.UsuariosResponse;
import com.reto.comidas.domain.modelo.Usuario;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)


public interface UsuariosResponseMapper {
    UsuariosResponse toResponse(Usuario usuario);

    List<UsuariosResponse> toResponseList(List<Usuario> usuarioList);
}
