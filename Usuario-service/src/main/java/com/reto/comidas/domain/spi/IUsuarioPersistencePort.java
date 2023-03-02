package com.reto.comidas.domain.spi;

import com.reto.comidas.domain.modelo.User;


import java.util.List;

public interface IUsuarioPersistencePort {
    void createUsuario(User usuario);
    List<User>getAllUsuario();
    User getUser(Integer id);
    User getUserByEmail(String email);



}
