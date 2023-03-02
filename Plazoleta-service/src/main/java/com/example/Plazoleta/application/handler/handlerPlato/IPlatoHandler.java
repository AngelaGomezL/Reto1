package com.example.Plazoleta.application.handler.handlerPlato;

import com.example.Plazoleta.application.dto.Plato.PlatoRequest;
import com.example.Plazoleta.domain.modelo.Plato;

public interface IPlatoHandler {
    void savePlato(PlatoRequest platoRequest);
    Plato findById(Integer id);

    void savePlato2(Plato platoRequest);


}
