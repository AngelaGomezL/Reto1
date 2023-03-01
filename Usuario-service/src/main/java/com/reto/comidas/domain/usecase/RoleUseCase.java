package com.reto.comidas.domain.usecase;

import com.reto.comidas.domain.api.IRoleServicePort;
import com.reto.comidas.domain.modelo.Role;
import com.reto.comidas.domain.spi.IRolePersistencePort;

import java.util.List;

public class RoleUseCase implements IRoleServicePort {
    private final IRolePersistencePort rolePersistencePort;

    public RoleUseCase(IRolePersistencePort rolePersistencePort) {
        this.rolePersistencePort = rolePersistencePort;
    }

    @Override
    public List<Role> getAllRoles() {

        return rolePersistencePort.getAllRoles();
    }

    @Override
    public Role getRoleById(Integer id) {

        return rolePersistencePort.getRoleById(id);
    }

    @Override
    public Role getRoleByNombre(String nombre) {
        return rolePersistencePort.getRoleByNombre(nombre);
    }
}
