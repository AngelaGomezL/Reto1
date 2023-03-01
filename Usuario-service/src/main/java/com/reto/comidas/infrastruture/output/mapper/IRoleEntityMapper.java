package com.reto.comidas.infrastruture.output.mapper;

import com.reto.comidas.domain.modelo.Role;
import com.reto.comidas.infrastruture.output.entity.RoleEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.ReportingPolicy;


import java.util.List;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface IRoleEntityMapper {
   @Mappings({
            @Mapping(target="id", source="id"),
            @Mapping(target="nombre", source="nombre"),
            @Mapping(target="descripcion", source="descripcion")
    })

    RoleEntity toEntity(Role role);
    Role toRole(RoleEntity roleEntity);
    List<Role> toRoles(List<RoleEntity> roleEntity);

}
