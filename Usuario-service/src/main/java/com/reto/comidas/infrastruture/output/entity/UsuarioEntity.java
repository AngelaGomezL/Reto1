package com.reto.comidas.infrastruture.output.entity;
//import jakarta.persistence.*;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "usuarios2")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
//FALTA LOMBOK
public class UsuarioEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "nombre", nullable = false)
    private String nombre;
    @Column(name = "apellido", nullable = false)
    private String apellido;
    @Column(name = "celular", nullable = false)
    private String celular;
    @Column(name = "correo", nullable = false)
    private String correo;
    @Column(name = "clave", nullable = false)
    private String clave;
    @Column(name ="id_rol",nullable = false)
    private String idRol;
    @Column(name ="documento_identidad",nullable = false)
    private String documentoIdentidad;



}
