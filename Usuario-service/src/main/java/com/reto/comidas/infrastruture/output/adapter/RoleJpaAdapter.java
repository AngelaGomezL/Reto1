package com.reto.comidas.infrastruture.output.adapter;

import com.reto.comidas.domain.modelo.Role;
import com.reto.comidas.domain.spi.IRolePersistencePort;
import com.reto.comidas.infrastruture.output.mapper.IRoleEntityMapper;
import com.reto.comidas.infrastruture.output.repository.IRoleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class RoleJpaAdapter implements IRolePersistencePort {
    private final IRoleRepository roleRepository;
    private final IRoleEntityMapper roleMapper;


    @Override
    public List<Role> getAllRoles() {
        return null;
    }
    @Override
    public Role getRoleById(Integer id) {
        return null;
    }

    @Override
    public Role getRoleByNombre(String nombre) {
        return null;
    }
}
