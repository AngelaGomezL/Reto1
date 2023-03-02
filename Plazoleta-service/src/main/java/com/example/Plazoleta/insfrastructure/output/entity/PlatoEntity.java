package com.example.Plazoleta.insfrastructure.output.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "Platos")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class PlatoEntity {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;
    @Column(name = "nombre", nullable = false)
    private String nombre;
    @Column(name = "id_categoria", nullable = false)
    private String idCategoria;
    @Column(name = "descripcion", nullable = false)
    private String descripcion;
    @Column(name = "precio", nullable = false)
    private String precio;

    @ManyToOne
    @JoinColumn(name="id_Restaurante",referencedColumnName ="id")
    private RestauranteEntity restaurante;

    @Column(name = "url_imagen", nullable = false)
    private String urlImagen;

    @Column(name = "activo",nullable = false)
    private Boolean activo;

}
