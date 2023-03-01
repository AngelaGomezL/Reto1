package com.reto.comidas.infrastruture.security.aut;

import com.reto.comidas.infrastruture.auth.UserAuthDto;
import com.reto.comidas.infrastruture.output.entity.UsuarioEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface IUserDetailsMapper {
    @Mapping(source = "userEntity.role.nombre", target = "role")
    DetailsUser toUser(UsuarioEntity userEntity);
    UserAuthDto toUserAuth(DetailsUser user);

}
