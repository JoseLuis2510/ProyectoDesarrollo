/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ProyectoDesarrollo.domain;


import jakarta.persistence.*;
import java.io.Serializable;
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
    private int idUsuario;
    private String user;
    private String email;
    private String password;

    public Usuario() {
    }

    public Usuario(String user, String email, String password) {
        this.user = user;
        this.email = email;
        this.password = password;
    }
    
    
    
}
