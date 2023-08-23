/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ProyectoDesarrollo.serviceImpl;

import com.ProyectoDesarrollo.dao.TicketDao;
import com.ProyectoDesarrollo.domain.Ticket;
import com.ProyectoDesarrollo.service.CreaTicketService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Andres.M
 */
@Service
public class CreaTicketServiceImpl implements CreaTicketService {
    @Autowired
    private TicketDao ticketDao;

    @Transactional(readOnly = true)
    public List<Ticket> getTickets(boolean activos) {
        List<Ticket> lista = ticketDao.findAll();
        if (activos) {
            //Para remover las productos donde activo = false
            lista.removeIf(x -> !x.isEstadoTicket());
        }
        return lista;
    }

    @Override
    @Transactional(readOnly = true)
    public Ticket getTicket(Ticket ticket) {
        return ticketDao.findById(ticket.getIdTicket()).orElse(null);
    }

    @Override
    @Transactional
    public void save(Ticket ticket) {
        ticketDao.save(ticket);
    }

    @Override
    @Transactional
    public void delete(Ticket ticket) {
        ticketDao.delete(ticket);
    }
}
