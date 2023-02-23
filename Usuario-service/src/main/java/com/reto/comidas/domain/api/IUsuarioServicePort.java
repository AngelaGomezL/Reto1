package com.reto.comidas.domain.api;

import com.reto.comidas.domain.modelo.Usuario;
import com.reto.comidas.infrastruture.output.entity.UsuarioEntity;

import java.util.List;

public interface IUsuarioServicePort {
    List<Usuario> getAllUsuario(Integer Id);
    void createUsuario(Usuario usuario);
}
