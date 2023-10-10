package com.example.votingapp.Candidate;

import com.example.votingapp.Party.Party;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class CandidateRequest {
    private String candidateName;
    private String phoneNumber;
    private String candidateAddress;
    private String candidatePassword;
    private String candidateUsername;
    private  String candidateEmail;
    private Party party;
}
