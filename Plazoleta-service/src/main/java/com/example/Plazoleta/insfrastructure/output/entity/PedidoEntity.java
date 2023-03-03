package com.example.Plazoleta.insfrastructure.output.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "Pedidos")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class PedidoEntity {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;
    @JoinColumn(name = "id_Cliente",referencedColumnName ="id", nullable = false)
    @OneToOne(optional = false, cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
    private UsuarioEntity idCliente;
    private String fecha;
    private String estado;
    private Integer idChef;
    private Integer idRestaurante;


}
