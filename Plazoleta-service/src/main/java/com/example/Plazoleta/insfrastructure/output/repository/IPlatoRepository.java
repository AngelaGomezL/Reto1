package com.example.Plazoleta.insfrastructure.output.repository;

import com.example.Plazoleta.insfrastructure.output.entity.PlatoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPlatoRepository extends JpaRepository<PlatoEntity, Integer> {


}
