package com.example.Plazoleta.insfrastructure.output.repository;

import com.example.Plazoleta.insfrastructure.output.entity.PlatoEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface IPlatoRepository extends JpaRepository<PlatoEntity, Integer> {
    @Query(value = "SELECT * FROM public.platos where id_restaurante = :idRestaurante", nativeQuery = true)
    Page<PlatoEntity> findByIdRestaurante(@Param("idRestaurante") Integer idRestaurante, Pageable pageable);


}
