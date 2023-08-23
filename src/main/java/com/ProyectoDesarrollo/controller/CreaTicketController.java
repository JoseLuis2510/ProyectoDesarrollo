/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ProyectoDesarrollo.controller;

import com.ProyectoDesarrollo.domain.Ticket;
import com.ProyectoDesarrollo.service.CreaTicketService;
import com.ProyectoDesarrollo.service.TicketService;
import com.ProyectoDesarrollo.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Andres.M
 */

@Controller
@RequestMapping("/creaTicket")
public class CreaTicketController{
        @Autowired
    TicketService ticketService;
    
    @Autowired
    UsuarioService usuarioService;
    
    @GetMapping("/creaTicket")
    public String page(Model model) {
        model.addAttribute("attribute", "value");
        return "/creaTicket/creaTicket";
    }
    @GetMapping("/formulario")
    public String mostrarFormularioCrear(Model model) {
        model.addAttribute("ticket", new Ticket());
        return "/creaTicket/creaTicket";
    }

    @PostMapping("/crear")  // Esta es la ruta para manejar la creación de tickets
    public String crearTicket(Ticket ticket) {
        ticketService.save(ticket);
        return "redirect:/creaTicket/formulario";  // Redirige de nuevo al formulario después de la creación
    }
}