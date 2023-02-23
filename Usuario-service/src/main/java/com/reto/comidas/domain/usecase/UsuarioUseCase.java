package com.reto.comidas.domain.usecase;

import com.reto.comidas.domain.api.IUsuarioServicePort;
import com.reto.comidas.domain.modelo.Usuario;
import com.reto.comidas.domain.spi.IUsuarioPersistencePort;
import com.reto.comidas.infrastruture.output.entity.UsuarioEntity;

import java.util.List;

public class UsuarioUseCase implements IUsuarioServicePort {
    private final IUsuarioPersistencePort usuarioPersistencePort;

    public UsuarioUseCase(IUsuarioPersistencePort usuarioPersistencePort) {
        this.usuarioPersistencePort = usuarioPersistencePort;
    }

    @Override
    public void createUsuario(Usuario usuario) {
        usuarioPersistencePort.createUsuario(usuario);

    }
    @Override
    public List<Usuario> getAllUsuario(Integer Id) {
        return null;
    }
}
