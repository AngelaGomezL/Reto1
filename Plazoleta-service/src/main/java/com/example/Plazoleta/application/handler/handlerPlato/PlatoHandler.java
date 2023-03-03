package com.example.Plazoleta.application.handler.handlerPlato;

import com.example.Plazoleta.application.dto.Plato.PlatoListResquest;
import com.example.Plazoleta.application.dto.Plato.PlatoRequest;
import com.example.Plazoleta.application.dto.Restaurante.RestauranteListRequest;
import com.example.Plazoleta.application.mapper.PlatoMapper.IPlatoRequestMapper;
import com.example.Plazoleta.domain.api.IPlatoServicePort;
import com.example.Plazoleta.domain.modelo.Plato;
import com.example.Plazoleta.domain.modelo.Restaurante;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class PlatoHandler implements IPlatoHandler {
    private final IPlatoServicePort platoServicePort;
    private final IPlatoRequestMapper platoRequestMapper;


    @Override
    public void savePlato(PlatoRequest platoRequest) {
        Plato plato = platoRequestMapper.toPlato(platoRequest);
        platoServicePort.savePlato(plato);
    }

    @Override
    public Plato findById(Integer id) {
        return platoServicePort.findById(id);
    }

    @Override
    public List<Plato> findAllByIdRestaurante(PlatoListResquest pagination) {
        return platoServicePort.findAllByIdRestaurante(pagination);
    }


    @Override
    public void savePlato2(Plato platoRequest) {
        platoServicePort.savePlato(platoRequest);
    }


}
