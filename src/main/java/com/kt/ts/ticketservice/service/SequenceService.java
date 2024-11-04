package com.kt.ts.ticketservice.service;

import com.kt.ts.ticketservice.model.Sequence;
import com.kt.ts.ticketservice.repository.SequenceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Service
public class SequenceService {
    @Autowired
    private SequenceRepository sequenceRepository;

    public String generateSequence() {
        String currentDate = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyyMMdd"));
        
        // Find the sequence for the current date, or create a new one
        Sequence sequence = sequenceRepository.findById(currentDate).orElse(new Sequence(currentDate, 0));

        // Increment the sequence number
        sequence.setSequenceNumber(sequence.getSequenceNumber() + 1);

        // Save or update the sequence in the database
        sequenceRepository.save(sequence);

        // Format the sequence number to four digits
        String formattedSequence = String.format("%04d", sequence.getSequenceNumber());

        // Return the final formatted sequence
        return "REQ" + currentDate + formattedSequence;
    }
}
