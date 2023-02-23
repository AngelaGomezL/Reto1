package com.reto.comidas.infrastruture.output.adapter;


import com.reto.comidas.domain.modelo.Usuario;
import com.reto.comidas.domain.spi.IUsuarioPersistencePort;
import com.reto.comidas.infrastruture.output.mapper.IUsuarioEntityMapper;
import com.reto.comidas.infrastruture.output.repository.IUsuarioRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class UsuarioJpaAdapter implements IUsuarioPersistencePort {
    private final IUsuarioRepository usuarioRepository;
    private final IUsuarioEntityMapper usuarioEntityMapper;


    @Override
    public void createUsuario(Usuario usuario) {
        System.out.println(usuario);
        usuarioRepository.save(usuarioEntityMapper.toEntity(usuario));
    }

    @Override
    public List<Usuario> getAllUsuario() {
        return null;
    }
}
