package com.example.Plazoleta.application.handler.handlerPlato;

import com.example.Plazoleta.application.dto.Plato.PlatoRequest;
import com.example.Plazoleta.application.dto.Plato.PlatoResponse;

public interface IPlatoHandler {
    void savePlato(PlatoRequest platoRequest);
    PlatoResponse getPlate(Integer id);

}
