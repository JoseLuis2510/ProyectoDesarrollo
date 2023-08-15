/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ProyectoDesarrollo.service;

import com.ProyectoDesarrollo.domain.Ticket;
import java.util.List;

/**
 *
 * @author Andres.M
 */
public interface TicketService {
    //Metodo que retorna la lista de tickets
    public List<Ticket> getTickets(boolean activos);
    
     // Se obtiene un Ticket, a partir del id de un ticket
    public Ticket getTicket(Ticket ticket);
    
    // Se inserta un nuevo ticket si el id del ticket esta vacío
    // Se actualiza un ticket si el id del ticket NO esta vacío
    public void save(Ticket ticket);
    
    // Se elimina el Ticket que tiene el id pasado por parámetro
    public void delete(Ticket ticket);
    
    
}
