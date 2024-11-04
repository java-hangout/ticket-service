package com.kt.ts.ticketservice.repository;

import com.kt.ts.ticketservice.model.Sequence;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SequenceRepository extends MongoRepository<Sequence, String> {
}
