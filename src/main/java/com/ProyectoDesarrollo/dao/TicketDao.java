/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ProyectoDesarrollo.dao;

import com.ProyectoDesarrollo.domain.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Andres.M
 */
public interface TicketDao extends JpaRepository<Ticket, Long> {
    
}
