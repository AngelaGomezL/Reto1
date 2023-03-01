package com.reto.comidas.domain.api;

import com.reto.comidas.domain.modelo.User;

import java.util.List;

public interface IUsuarioServicePort {
    List<User> getAllUsuario(Integer Id);
    void createUsuario(User usuario, Integer idRol);
    User getUserByEmail(String email);
    boolean existByEmail(String email);

}
