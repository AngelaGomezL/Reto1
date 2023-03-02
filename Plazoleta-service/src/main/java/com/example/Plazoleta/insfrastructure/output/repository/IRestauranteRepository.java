package com.example.Plazoleta.insfrastructure.output.repository;

import com.example.Plazoleta.insfrastructure.output.entity.RestauranteEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface IRestauranteRepository extends JpaRepository<RestauranteEntity,Integer> {
    Optional<RestauranteEntity> findById(Integer id);

    List<RestauranteEntity> findAll();

}
