package com.reto.comidas.infrastruture.output.repository;

import com.reto.comidas.infrastruture.output.entity.RoleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface IRoleRepository extends JpaRepository<RoleEntity, Integer> {
    Optional<RoleEntity> findByNombre(String nombre);
    Optional<RoleEntity> findById(Integer Id);


}
