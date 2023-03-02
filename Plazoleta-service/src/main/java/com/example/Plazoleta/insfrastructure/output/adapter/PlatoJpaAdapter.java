package com.example.Plazoleta.insfrastructure.output.adapter;

import com.example.Plazoleta.domain.modelo.Plato;
import com.example.Plazoleta.domain.modelo.Restaurante;
import com.example.Plazoleta.domain.spi.IPlatoPersistencePort;
import com.example.Plazoleta.insfrastructure.output.entity.PlatoEntity;
import com.example.Plazoleta.insfrastructure.output.entity.RestauranteEntity;
import com.example.Plazoleta.insfrastructure.output.mapper.IPlatoEntityMapper;
import com.example.Plazoleta.insfrastructure.output.repository.IPlatoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

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
        return platoEntityMapper.toPlato(platoRepository.findById(id).get());
    }
}
