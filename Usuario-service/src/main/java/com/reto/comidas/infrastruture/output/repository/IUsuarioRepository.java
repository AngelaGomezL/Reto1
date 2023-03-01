package com.reto.comidas.infrastruture.output.repository;

import com.reto.comidas.infrastruture.output.entity.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;
import java.util.Optional;

public interface IUsuarioRepository extends JpaRepository<UsuarioEntity,Integer> {

     Optional<UsuarioEntity>findById(Integer id);
     Optional<UsuarioEntity> findByEmail(String email);


     //List<Optional<UsuarioEntity>> findClientByRoleId(Integer idRol);

}
