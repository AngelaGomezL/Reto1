package com.reto.comidas.domain.spi;

import com.reto.comidas.domain.modelo.Usuario;
import com.reto.comidas.infrastruture.output.entity.UsuarioEntity;


import java.util.List;

public interface IUsuarioPersistencePort {
    void createUsuario(Usuario usuario);
    List<Usuario>getAllUsuario();



}
