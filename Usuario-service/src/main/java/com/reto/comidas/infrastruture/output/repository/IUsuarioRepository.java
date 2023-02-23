package com.reto.comidas.infrastruture.output.repository;

import com.reto.comidas.infrastruture.output.entity.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.Optional;

public interface IUsuarioRepository extends JpaRepository<UsuarioEntity,Integer> {

     Optional<UsuarioEntity>findById(Integer id);

}
