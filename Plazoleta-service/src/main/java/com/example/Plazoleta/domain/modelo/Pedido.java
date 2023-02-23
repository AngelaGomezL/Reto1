package com.example.Plazoleta.domain.modelo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class Pedido {
    private Integer id;
    private Integer idCliente;
    private String fecha;
    private String estado;
    private Integer idChef;
    private Integer idRestaurante;

}
