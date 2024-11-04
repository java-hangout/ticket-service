package com.kt.ts.ticketservice.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "sequences")
public class Sequence {
    @Id
    private String date; // format YYYYMMDD
    private int sequenceNumber;

    public Sequence() {}

    public Sequence(String date, int sequenceNumber) {
        this.date = date;
        this.sequenceNumber = sequenceNumber;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getSequenceNumber() {
        return sequenceNumber;
    }

    public void setSequenceNumber(int sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }
}
