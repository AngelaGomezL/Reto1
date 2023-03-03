package com.example.Plazoleta.insfrastructure.output.entity;
//import jakarta.persistence.*;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "usuarios3")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class UsuarioEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",nullable = false)
    private Integer id;
    @Column(name = "nombre", nullable = false)
    private String nombre;
    @Column(name = "apellido", nullable = false)
    private String apellido;
    @Column(name = "celular", nullable = false)
    private String celular;
    @Column(name = "email", nullable = false)
    private String email;
    @Column(name = "clave", nullable = false)
    private String clave;
    @JoinColumn(name = "id_role",referencedColumnName ="id", nullable = false)
    @ManyToOne(optional = false, cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
    private RoleEntity role;
    @Column(name ="documento_identidad",nullable = false)
    private String documentoIdentidad;

}
