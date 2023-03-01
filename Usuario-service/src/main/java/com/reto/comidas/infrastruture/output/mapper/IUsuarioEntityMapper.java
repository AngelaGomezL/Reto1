package com.reto.comidas.infrastruture.output.mapper;

import com.reto.comidas.domain.modelo.User;
import com.reto.comidas.infrastruture.output.entity.UsuarioEntity;
import org.mapstruct.*;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.List;
import java.util.Optional;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface IUsuarioEntityMapper {

    @Mappings({
            @Mapping(target="id", source="id"),
            @Mapping(target="nombre", source="nombre"),
            @Mapping(target="apellido", source="apellido"),
            @Mapping(target="documentoIdentidad", source="documentoIdentidad"),
            @Mapping(target="celular", source="celular"),
            @Mapping(target="email", source="email"),
            @Mapping(target="role", source="role"),
            @Mapping(source = "clave", target = "clave", qualifiedByName = "encriptacion")

    })
    UsuarioEntity toEntity(User usuario);
    User toUsuario(Optional<UsuarioEntity> usuarioEntity);
    List<User>toUsuario(List<Optional<UsuarioEntity>> usuarioEntitu);

    @Named("encriptacion")
    public static String encriptacion(String clave) {
        BCryptPasswordEncoder encoder =  new BCryptPasswordEncoder();
        return encoder.encode(clave) ;
    }


}
