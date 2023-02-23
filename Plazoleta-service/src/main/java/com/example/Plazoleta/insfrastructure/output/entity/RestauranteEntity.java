package com.example.Plazoleta.insfrastructure.output.entity;
import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "Restaurante")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RestauranteEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;
    /*private String direccion;
    private Integer idPropietario;
    private String telefono;
    private String urlLogo;
    private String nit;*/

}
