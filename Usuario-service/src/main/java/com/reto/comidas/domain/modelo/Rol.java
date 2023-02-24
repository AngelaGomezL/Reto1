package com.reto.comidas.domain.modelo;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
@Setter
@Getter
public class Rol {
    private Integer id;
    private String nombre;
    private String descripcion;
}