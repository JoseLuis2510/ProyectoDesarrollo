/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ProyectoDesarrollo.domain;


import jakarta.persistence.*;
import java.io.Serializable;
import java.util.List;
import javax.validation.constraints.NotEmpty;
import lombok.Data;

/**
 *
 * @author Andres.M
 */
@Data
@Entity
@Table(name="usuario")
public class Usuario implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_usuario")
    private Long idUsuario;
    
    @NotEmpty
    private String username;
    
    @NotEmpty
    private String password;
    private String nombre;
    private String correo;
    

    @OneToMany
    @JoinColumn(name= "id_usuario")
    private List<Rol> roles;

    
    
}
