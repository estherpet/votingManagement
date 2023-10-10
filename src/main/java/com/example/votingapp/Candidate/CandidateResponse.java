package com.example.votingapp.Candidate;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class CandidateResponse {
    private String candidateAddress;
    private String candidateUsername;
    private String candidateEmail;
    private String candidateName;

}
