package com.reto.comidas.application.handler;

import com.reto.comidas.application.dto.UsuariosRequest;
import com.reto.comidas.application.dto.UsuariosResponse;
import com.reto.comidas.application.mapper.UsuariosRequestMapper;
import com.reto.comidas.domain.api.IUsuarioServicePort;
import com.reto.comidas.domain.modelo.Usuario;
import com.reto.comidas.infrastruture.output.entity.UsuarioEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class UsuariosHandler implements IUsuariosHandler{
    private final IUsuarioServicePort usuarioServicePort;
    private final UsuariosRequestMapper usuariosRequestMapper;
    private final UsuariosRequestMapper usuariosResponseMapper;


    @Override
    public void saveUsuario(UsuariosRequest usuariosRequest) {
        Usuario usuario = usuariosRequestMapper.toUsuario(usuariosRequest);
        System.out.println("Holaaaaaaaaaaaaaaaaaaaaaaaaa");
        usuarioServicePort.createUsuario(usuario);
    }


    @Override
    public List<UsuariosResponse> getAllUsuarioFromUsuarios() {
        return null;
    }

}
