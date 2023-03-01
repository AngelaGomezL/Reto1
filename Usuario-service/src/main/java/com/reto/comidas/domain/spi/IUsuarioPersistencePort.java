package com.reto.comidas.domain.spi;

import com.reto.comidas.domain.modelo.User;


import java.util.List;

public interface IUsuarioPersistencePort {
    void createUsuario(User usuario);
    List<User>getAllUsuario();
    User getUserByEmail(String email);
    boolean existsByEmail(String email);



}
