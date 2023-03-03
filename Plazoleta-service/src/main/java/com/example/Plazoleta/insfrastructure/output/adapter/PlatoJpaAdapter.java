package com.example.Plazoleta.insfrastructure.output.adapter;

import com.example.Plazoleta.application.dto.Plato.PlatoListResquest;
import com.example.Plazoleta.domain.modelo.Plato;
import com.example.Plazoleta.domain.spi.IPlatoPersistencePort;
import com.example.Plazoleta.insfrastructure.output.entity.PlatoEntity;
import com.example.Plazoleta.insfrastructure.output.mapper.IPlatoEntityMapper;
import com.example.Plazoleta.insfrastructure.output.repository.IPlatoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class PlatoJpaAdapter implements IPlatoPersistencePort {
    private  final IPlatoRepository platoRepository;
    private final IPlatoEntityMapper platoEntityMapper;


    @Override
    public void savePlato(Plato plato) {
        PlatoEntity platoEntity = platoEntityMapper.toEntity(plato);
        platoRepository.save(platoEntity);
    }

    @Override
    public List<Plato> getAllPlatos() {
        return null;
    }

    @Override
    public Plato getPlato(Integer id) {
        return null;
    }

    @Override
    public void updatePlate(Plato plato) {

    }

    @Override
    public Plato findById(Integer id) {
        var a = platoRepository.findById(id).get();
        return platoEntityMapper.toPlato(a).toBuilder().idRestaurante(a.getRestaurante().getId()).build();
    }

    @Override
    public List<Plato> findAllByIdRestaurante(PlatoListResquest paginationRequest) {
        Pageable pagination = PageRequest.of(paginationRequest.getPagina(),
                paginationRequest.getCantidad(),
                Sort.by(paginationRequest.getSort()).descending());
        return platoRepository.findByIdRestaurante( paginationRequest.getIdRestaurante(),pagination).stream()
                .map(platoEntity -> platoEntityMapper.toPlato(platoEntity))
                .collect(Collectors.toList());
    }
}
