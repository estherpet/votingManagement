package com.example.votingapp.Candidate;

import com.example.votingapp.Candidate.Candidate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CanditateRepository extends JpaRepository<Candidate,Long> {
}
