package com.example.votingapp.Vote;

import com.example.votingapp.Vote.Vote;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VoteRepository extends JpaRepository<Vote,Long> {
}
