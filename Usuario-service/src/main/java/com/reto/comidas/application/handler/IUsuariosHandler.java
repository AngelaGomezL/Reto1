package com.reto.comidas.application.handler;

import com.reto.comidas.application.dto.UsuariosRequest;
import com.reto.comidas.application.dto.UsuariosResponse;

import java.util.List;

public interface IUsuariosHandler {
    void saveUsuario(UsuariosRequest usuariosRequest,Integer idRol);
    List<UsuariosResponse> getAllUsuarioFromUsuarios();



}
