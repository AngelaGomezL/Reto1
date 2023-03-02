package com.reto.comidas.infrastruture.output.adapter;


import com.reto.comidas.domain.modelo.User;
import com.reto.comidas.domain.spi.IUsuarioPersistencePort;
import com.reto.comidas.infrastruture.output.mapper.IUsuarioEntityMapper;
import com.reto.comidas.infrastruture.output.repository.IUsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class UsuarioJpaAdapter implements IUsuarioPersistencePort {
    private final IUsuarioRepository usuarioRepository;
    private final IUsuarioEntityMapper usuarioEntityMapper;


    @Override
    public void createUsuario(User usuario) {
        usuarioRepository.save(usuarioEntityMapper.toEntity(usuario));
    }

    @Override
    public List<User> getAllUsuario() {
        return null;
    }

    @Override
    public User getUser(Integer id) {
        return null;
    }

    @Override
    public User getUserByEmail(String email) {
        return null;
    }


}
