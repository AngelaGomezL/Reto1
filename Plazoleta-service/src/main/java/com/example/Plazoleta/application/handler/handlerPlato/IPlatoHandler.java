package com.example.Plazoleta.application.handler.handlerPlato;

import com.example.Plazoleta.application.dto.Plato.PlatoListResquest;
import com.example.Plazoleta.application.dto.Plato.PlatoRequest;
import com.example.Plazoleta.domain.modelo.Plato;

import java.util.List;

public interface IPlatoHandler {
    void savePlato(PlatoRequest platoRequest);
    Plato findById(Integer id);
    List<Plato> findAllByIdRestaurante(PlatoListResquest pagination);
    void savePlato2(Plato platoRequest);


}
