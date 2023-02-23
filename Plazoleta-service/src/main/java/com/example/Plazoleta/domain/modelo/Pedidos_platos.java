package com.example.Plazoleta.domain.modelo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class Pedidos_platos {
    private Integer idPedido;
    private Integer idPlato;
    private String cantidad;

}
