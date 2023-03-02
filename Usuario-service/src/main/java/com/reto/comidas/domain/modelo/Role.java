package com.reto.comidas.domain.modelo;

import lombok.*;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Role {
    private Integer id;
    private String nombre;
    private String descripcion;
}