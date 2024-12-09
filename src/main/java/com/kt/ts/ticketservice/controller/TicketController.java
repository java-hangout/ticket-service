package com.kt.ts.ticketservice.controller;

import com.kt.ts.ticketservice.model.Ticket;
import com.kt.ts.ticketservice.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ticket")
public class TicketController {

    @Autowired
    private TicketService ticketService;

    @PostMapping("/create")
    public Ticket createTicket(@RequestBody Ticket ticket) {

        return ticketService.createTicket(ticket);
    }

    @GetMapping("/user/{userId}")
    public List<Ticket> getUserTickets(@PathVariable String userId) {

        return ticketService.getUserTickets(userId);
    }

    @GetMapping("/{id}")
    public Ticket getTicket(@PathVariable String id) {

        return ticketService.getTicket(id);
    }

    @PutMapping("/{id}")
    public Ticket updateTicket(@PathVariable String id, @RequestBody Ticket ticket) {
        ticket.setId(id);
        return ticketService.updateTicket(ticket);
    }

}
