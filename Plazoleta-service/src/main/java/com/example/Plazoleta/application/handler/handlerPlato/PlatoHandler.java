package com.example.Plazoleta.application.handler.handlerPlato;

import com.example.Plazoleta.application.dto.Plato.PlatoRequest;
import com.example.Plazoleta.application.dto.Plato.PlatoResponse;
import com.example.Plazoleta.application.mapper.PlatoMapper.IPlatoRequestMapper;
import com.example.Plazoleta.domain.api.IPlatoServicePort;
import com.example.Plazoleta.domain.modelo.Plato;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

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
    public PlatoResponse getPlate(Integer id) {
        return null;
    }
}
