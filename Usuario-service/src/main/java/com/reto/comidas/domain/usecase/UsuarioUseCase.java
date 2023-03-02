package com.reto.comidas.domain.usecase;

import com.reto.comidas.domain.api.IUsuarioServicePort;
import com.reto.comidas.domain.modelo.Role;
import com.reto.comidas.domain.modelo.User;
import com.reto.comidas.domain.spi.IRolePersistencePort;
import com.reto.comidas.domain.spi.IUsuarioPersistencePort;

import java.util.List;

public class UsuarioUseCase implements IUsuarioServicePort {
    private final IUsuarioPersistencePort usuarioPersistencePort;
    private final IRolePersistencePort rolePersistencePort;

    public UsuarioUseCase(IUsuarioPersistencePort usuarioPersistencePort, IRolePersistencePort rolePersistencePort) {
        this.usuarioPersistencePort = usuarioPersistencePort;
        this.rolePersistencePort = rolePersistencePort;
    }

    @Override
    public List<User> getAllUsuario(Integer Id) {
        return null;
    }

    @Override
    public void createUsuario(User usuario, Integer idRol) {
        Role role = Role.builder().id(idRol).build();
        usuario.setRole(role);
        usuarioPersistencePort.createUsuario(usuario);
    }

    @Override
    public User getUserByEmail(String email) {
        return usuarioPersistencePort.getUserByEmail(email);
    }

    @Override
    public boolean existByEmail(String email) {
        return false;
    }


}
