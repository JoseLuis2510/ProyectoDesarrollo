/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ProyectoDesarrollo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Andres.M
 */

@Controller
@RequestMapping("/creacionTicket")
public class CreacionTicketsController {
    
    @GetMapping("/tickets")
    public String page(Model model) {
        model.addAttribute("attribute", "value");
        return "creacionTicket/tickets";
    }
    
}
