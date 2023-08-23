/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ProyectoDesarrollo.controller;

import com.ProyectoDesarrollo.domain.Ticket;
import com.ProyectoDesarrollo.domain.Usuario;
import com.ProyectoDesarrollo.service.TicketService;
import com.ProyectoDesarrollo.service.UsuarioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author Andres.M
 */

@Controller
@RequestMapping("/ticket")
public class TicketController {
    
    
    @Autowired
    TicketService ticketService;
    
    @Autowired
    UsuarioService usuarioService;
    
    @GetMapping("/listado")
    public String inicio(Model model) {
        List<Ticket> tickets = ticketService.getTickets(false);
        model.addAttribute("tickets", tickets);
        model.addAttribute("totalTickets", tickets.size());
        return "/ticket/listado";
    }
    
    @GetMapping("/nuevo")
    public String ticketNuevo(Ticket ticket) {
        return "/ticket/modifica";
    }
    
    @PostMapping("/guardar")
    public String ticketGuardar(Ticket ticket) {        
        ticketService.save(ticket);
        return "redirect:/ticket/listado";
    }
    
    @GetMapping("/eliminar/{idTicket}")
    public String ticketEliminar(Ticket ticket) {
        ticketService.delete(ticket);
        return "redirect:/ticket/listado";
    }
    
    @GetMapping("/modifica/{idTicket}")
    public String ticketModificar(Ticket ticket, Model model) {
        ticket = ticketService.getTicket(ticket);
        model.addAttribute("ticket", ticket);
        return "/ticket/modifica";
    }
    

    
    
}
