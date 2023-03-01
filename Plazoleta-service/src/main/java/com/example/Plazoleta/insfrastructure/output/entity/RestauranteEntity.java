package com.example.Plazoleta.insfrastructure.output.entity;
import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "restaurante")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RestauranteEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @NonNull
    @Column(name = "nombre", nullable = false)
    private String nombre;
    @Column(name = "direccion", nullable = false)
    private String direccion;
    @Column(name = "id_propietario", nullable = false)
    private Integer idPropietario;
    @Column(name = "telefono", nullable = false)
    private String telefono;
    @Column(name = "urlLgo", nullable = false)
    private String urlLogo;
    @Column(name = "nit", nullable = false)
    private String nit;

}
