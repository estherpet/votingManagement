package com.example.votingapp.Candidate;

import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CandidateMapper {
    private final PasswordEncoder passwordEncoder;
    public Candidate toCandidate(CandidateRequest candidateRequest){
        return Candidate.builder()
                .candidateEmail(candidateRequest.getCandidateEmail())
                .candidateName(candidateRequest.getCandidateName())
                .candidatePassword(passwordEncoder.encode(candidateRequest.getCandidatePassword()))
                .candidateAddress(candidateRequest.getCandidateAddress())
                .candidateUserName(candidateRequest.getCandidateUsername())
                .phoneNumber(candidateRequest.getPhoneNumber())
                .party(candidateRequest.getParty())
                .build();
    }
    public CandidateResponse toResponce(Candidate candidate){
        return CandidateResponse.builder()
                .candidateAddress(candidate.getCandidateAddress())
                .candidateEmail(candidate.getCandidateEmail())
                .candidateUsername(candidate.getCandidateUserName())
                .candidateName(candidate.getCandidateName())
                .build();
    }

}
