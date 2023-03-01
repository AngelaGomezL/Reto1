package com.reto.comidas.domain.api;

import com.reto.comidas.domain.modelo.Role;

import java.util.List;

public interface IRoleServicePort {
    List<Role> getAllRoles();
    Role getRoleById(Integer id);
    Role getRoleByNombre(String nombre);


}
