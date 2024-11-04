package com.kt.ts.ticketservice.service;

import com.kt.ts.ticketservice.model.Ticket;
import com.kt.ts.ticketservice.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import java.util.Random;

@Service
public class TicketService {
    @Autowired
    private TicketRepository ticketRepository;

    @Autowired
    private SequenceService sequenceService;

    public Ticket createTicket(Ticket ticket) {
        String ticketNumber = sequenceService.generateSequence();
        ticket.setTicketNumber(ticketNumber);
        return ticketRepository.save(ticket);
    }

    public List<Ticket> getUserTickets(String userId) {
        return ticketRepository.findByUserId(userId);
    }

    public Ticket getTicket(String id) {
        return ticketRepository.findById(id).orElse(null);
    }

    public Ticket updateTicket(Ticket ticket) {
        return ticketRepository.save(ticket);
    }
}
