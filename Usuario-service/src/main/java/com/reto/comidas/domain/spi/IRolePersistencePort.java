package com.reto.comidas.domain.spi;

import com.reto.comidas.domain.modelo.Role;

import java.util.List;

public interface IRolePersistencePort {
    List<Role> getAllRoles();
    Role getRoleById(Integer id);
    Role getRoleByNombre(String nombre);

}
